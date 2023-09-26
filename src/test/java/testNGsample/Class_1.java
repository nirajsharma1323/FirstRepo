package testNGsample;

import org.testng.annotations.Test;

public class Class_1 {

	
	
	@Test(priority=2)
	
	public void login() {
		
		System.out.println("Login successful");
		
	}
	
	@Test(priority=1)
	public void Accountlogin() {
		
		System.out.println("AccountLogin successful");
		
	}
	

}
