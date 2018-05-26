package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExercise {

	@Test(dataProvider="credentials")
	public void practice (String username, String password, int age)
	{
	
		System.out.println("Password is " + password);
		System.out.println("Username is " + username);
		System.out.println("age is " + age);
	}
	
	@DataProvider(name="credentials") 
	public Object[][] enterData()
	{
		
		Object[][] data= new Object[1][3];
			data[0][0]= "editor";
			data[0][1]= "Welcome";
			data[0][2]=20;
			
			
			
			return data;
			
			
				
	}
	
	
	
}
