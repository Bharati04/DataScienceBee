package com.acti.Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript {

	public static WebDriver driver;// Define global variable
	public static Properties prop;

	// create a constructor for driver script- because i want to read the
	// property file first
	public DriverScript() {
		try {// where exactly your properties file - src of input
			File src = new File("./actiConfigeration/config.properties");
			FileInputStream fis = new FileInputStream(src);
			// create a object of class
			prop = new Properties();
			prop.load(fis);

		}

		catch (Exception e) {
			System.out.println("Unable to load property file " + e.getMessage());
		}
	}
//@Test // after unit testing delete it 
	// create one method
	public static void initApp() {
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./actiBrowsers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./actiBrowsers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// for elements on the page
		
		String url = prop.getProperty("qaurl");
		driver.get(url);
		
	}

}
