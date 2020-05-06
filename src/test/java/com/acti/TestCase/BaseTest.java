package com.acti.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.Base.DriverScript;
import com.acti.Pages.EnterTimePage;
import com.acti.Pages.LoginPage;
import com.acti.Pages.TaskPage;

public class BaseTest extends DriverScript{
	LoginPage lp;
	EnterTimePage etp;
	TaskPage tp;
	
	public BaseTest()
	{
		super();
		
	}
	@BeforeMethod
	public void preTest()
	{
		initApp();
		lp =new LoginPage();
		etp=new EnterTimePage();
		tp=new TaskPage();
	}
	/*@AfterMethod
	public void postTest()
	{
		driver.close();
	}*/

}
