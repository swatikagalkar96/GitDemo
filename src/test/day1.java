package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {


		// TODO Auto-generated method stub
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
		System.out.println("I will execute last2");
		System.out.println("I will execute last3");
		System.out.println("Heyyyyyyyy!!");
		System.out.println("I'm Swati Kagalkar");
	}
	@Test
	public void Demo()
	{
		System.out.println("hello");//automation
		Assert.assertTrue(false);
	}
	
	public void Demo1()
	{
		System.out.println("Hello Swati");//automation
		Assert.assertTrue(false);
	}
	@AfterSuite
	
	public void afSyite()
	{
		System.out.println("I am the no 1 from last ");
	}
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}



}
