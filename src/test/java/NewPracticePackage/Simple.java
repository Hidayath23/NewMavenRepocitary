package NewPracticePackage;

import org.testng.annotations.Test;

public class Simple 
{
	@Test(groups = {"Smoke", "Reggression"})
	public void simple()
	{
		System.out.println("Simple programme is executing");
	}
	
	@Test(groups = {"Smoke", "Reggression"})
	public void simple1()
	{
		System.out.println("Simple programme is executing");
	}
}
