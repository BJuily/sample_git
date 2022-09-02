

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;

import gmail_task.gmail_inbox;
import gmail_task.gmail_user;

//import net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.System;


public class gmail_read_mail
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\juilymborkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://accounts.google.com/");	
    //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
    Logger logger;
    logger=Logger.getLogger("gmail_task");
    PropertyConfigurator.configure("Log4j.properties");
    logger.info("URL is opened...");
 
    gmail_user login=new gmail_user(driver); //login page
    login.userid();
    logger.info("userid...");

    login.clickbtn();
    logger.info("click button...");

    login.password();
    logger.info("password...");

    login.nextbtn();
    logger.info("next button...");
    
    logger.info("login successfull...");
    
    gmail_inbox inbox=new gmail_inbox(driver); //inbox page
    inbox.settingbtn(); //google account setting
    logger.info("go to setting...");

    driver.switchTo().frame("app"); //move to apps
    logger.info("move to apps...");
    
    inbox.gmailbtn(); //app button
    logger.info("gmail button...");
    
    Set<String> window=driver.getWindowHandles();
    Iterator<String> itr=window.iterator();
    String window1=itr.next();
    logger.info("visit first frame...");

    String window2=itr.next();
    logger.info("visit next frame...");

    driver.switchTo().window(window2); //switch to desired window
    logger.info("switching window...");
    
    inbox.inboxbtn(); //inbox button from frame
    logger.info("inbox button...");

    inbox.unreadcount(); //count messages
    logger.info("show me unread count...");
  
}
}

