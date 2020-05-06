package com.acti.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.acti.Base.DriverScript;

public class Common extends DriverScript
{
	public static void highLightElement(WebElement ele)
	{
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background:lightblue;border: 2px solid yellow;')",ele);
		
	}

}
