package com.acti.TestCase;

import org.testng.annotations.Test;

public class TestCreateCustomer extends BaseTest {
	

	@Test(priority = 1)
	public void testCreateCustomer() {
		lp.validateLogin("admin", "manager");
		String userlogged = etp.getuserLoggedInText();
		System.out.println(userlogged);
		etp.clickTaskMenu();
		tp.clickAddNewButton();
		tp.clickNewCusotmerOption();
		tp.enterCustomerName("TestCustomer10");
		tp.enterCustomerDescription("Creating Dummy Customer for Test");
		tp.createCustomerBtn();
		etp.clickLogoutLink();

	}
/*
	//@Test(priority = 2)
	public void verifyText() {
		String text = lp.verifyLoginPageTitle();
		Assert.assertEquals("tester", text);
		Assert.assertFalse(false);
		driver.close();
		
		
	}*/
}
