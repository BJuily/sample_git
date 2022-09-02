package RetryAnalyzer;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import screenshot.screenshot;

public class RetryTest 
{
	public WebDriver driver;
	String tcid;
@BeforeTest
public void open_browser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\juilymborkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
}
@Test(retryAnalyzer=RetryAnalyzerClass.class)
public void TestRun()
{
	String title= driver.getTitle();
	assertEquals(title,"google");		
}
@AfterTest
public void complete()
{
	driver.quit();
}

}
