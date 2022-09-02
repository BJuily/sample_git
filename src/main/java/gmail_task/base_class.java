package gmail_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config.config;

public class base_class
{
	public WebDriver driver;

	public void open_browser()
	{
	System.setProperty("webdriver.chrome.driver", config.chrome_path);
	driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://accounts.google.com/");	
}

}
