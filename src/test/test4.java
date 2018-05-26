package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test4 {
	
	
	@Test(enabled=false) // this TestNG helps to skip this test case
	public void WebloginHomeLoan()
	{
		//Code
		System.out.println("Weblogin");
	}
	
	@Test(groups = {"Smoke"})// with help of Groups we can group of test cases we want to run among all test cases
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("Smoke test4");
	}
	
	@Test(dataProvider="getData")
	public void LoginAPIHomeLoan1(String username, String password)
	{
		//Rest Car API 
		System.out.println("Car API");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test( timeOut=4000)// timeout means this test will not fail till 40 seconds. 
	public void LoginAPIHomeLoan()
	{
		//Rest Car API 
		System.out.println("Car API");
	}	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - username password - good credit History
		//2nd combination - username password - no credit history
		//3rd fraudelant credit history
		
		Object [][] data = new Object [3][2];
		
		//1st set
		data[0][0]= "firstsetusername";
		data[0][1]= "password";
		
		//2nd set
		data[1][0]= "secondsetusername";
		data[1][1]= "secondpassword";
		
		//3rd set
		
		data[2][0]= "thirdsetusername";
		data[2][1]= "thirdpassword";
		
		return data;
		
		
	}
		
		
	

}

