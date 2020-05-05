package com.acti.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.acti.Base.DriverScript;
import com.acti.Pages.LoginPage;
/* Script: LoginPage test case
 * Tester: Bharati
 * Verified by: Bharati
 * Date Created : 5/5/2020
 * Last Modified: 5/5/2020
 */
public class LoginPageTest extends DriverScript
{
	LoginPage lp;
	public LoginPageTest()
	{
		//super keyword is used to call the base constructor(Parent Class Constructor)
		super();
	}
	@BeforeMethod
	public void preTest()
	{
		initApp();// methods written in driver script and calling it here
		lp= new LoginPage();
		
	}

	@AfterMethod
	public void postTest()
	{
		driver.close();
	}
/*	@Test(priority=1)
	public void testVerifyActiLogo()
	{
	//LoginPage lp= new LoginPage();
	boolean flag = lp.verifyActiLogo();// store it in some variable  flag which is boolean
	System.out.println(flag);
	Assert.assertTrue(flag);
		
	}
	@Test(priority=2)
	public void testLoginPageTitle()
	{
		//LoginPage lp= new LoginPage();
		String  title = lp.verifyLoginPageTitle();// store it in some variable  title which is String
		Assert.assertEquals("actiTIME - Login", title);
		
	}
	@Test(priority=3)
	public void testValidateLoginFunction()
	{
		//LoginPage lp= new LoginPage();
		lp.validateLogin("admin", "manager");
	}*/
	
	// we can also get the username and Password from the properties file./
	//before that we have to update the username and password in properties file and save it
	@Test(priority=4)
	public void testValidateLoginFunction1()
	{
		//LoginPage lp= new LoginPage();
		lp.validateLogin(prop.getProperty("username"),prop.getProperty("password"));
	}
	
}
