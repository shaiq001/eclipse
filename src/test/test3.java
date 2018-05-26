package test;

import org.testng.annotations.Test;

public class test3 {
	
	
	@Test(groups = {"Smoke"})
	public void WebloginCarLoan()
	{
		//Code
		System.out.println("Smoke test3");
	}
	
	@Test
	public void MobileLoginCarLoan()
	{
		//Appium
		System.out.println("Car Loan");
	}
	
	@Test
	public void LoginAPICarLoan()
	{
		//Rest Car API 
		System.out.println("Car API");
	}

}

