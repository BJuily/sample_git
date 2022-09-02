package screenshot;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import gmail_task.base_class;

public class screenshot_task extends listener
{
	base_class base=new base_class();
	String tcid;
	@BeforeSuite
	public void login()
	{
		base.open_browser();
	}
	@Test
	public void TC01()
	{
		tcid="TC01";
		System.out.println("TC01 executed");
	}
	@Test
	public void TC02()
	{
		tcid="TC02";
		System.out.println("TC02 executed");
		Assert.fail();
	}
	@AfterSuite
	public void close_browser()
	{
		driver.close();
	}
	
	
	
//	public void get_status(ITestResult r) throws IOException
//	{
//		if(r.getStatus()==ITestResult.FAILURE)
//		{
//			screenshot s=new screenshot();
//			s.screenshot();
//		}
//	}

}
