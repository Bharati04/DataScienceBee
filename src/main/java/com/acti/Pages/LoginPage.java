package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.Base.DriverScript;
import com.acti.Utils.Common;
/* Script: LoginPage
 * Tester: Bharati
 * Verified by: Bharati
 * Date Created : 5/5/2020
 * Last Modified: 5/5/2020
 */
//We are writing the supporting class all validation will be done in test cases
public class LoginPage extends DriverScript {
	// *****************************Page elements Identification***************************//

	@FindBy(id = "logoContainer")
	WebElement actiLogo; // logo acronym to represent the element from the web
							// page
	@FindBy(id = "username")
	WebElement usernameTb; // Tb acronym to represent the element from
							// webpage
	@FindBy(name = "pwd")
	WebElement passwordTb;
	
	@FindBy(id = "loginButton")
	WebElement loginBtn;
	
	// *****************************Page initialization***************************//
	
	public LoginPage()
	{
		//PageFactory.initElements(driver, LoginPage.class);// or we can write like 
		
		PageFactory.initElements(driver, this);
		// pagefactory is the class in POM (page object model) which is used to initialize the page elements which takes
		//two arguments one is from driver script and one is from current class(this)
	}
	// *****************************Page Actions /Methods***************************//
	public boolean verifyActiLogo()
	{
		return actiLogo.isDisplayed();
	
	}
	public void validateLogin(String username,String password)
	{
		Common.highLightElement(usernameTb);
		usernameTb.sendKeys(username);
		Common.highLightElement(passwordTb);
		passwordTb.sendKeys(password);
		Common.highLightElement(loginBtn);
		loginBtn.click();
	}
	
	public String verifyLoginPageTitle()
	{
		return driver.getTitle();
	}
}
