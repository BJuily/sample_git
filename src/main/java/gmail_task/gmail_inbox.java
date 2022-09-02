package gmail_task;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmail_inbox
{

	@FindBy(xpath="//a[@class='gb_A']") private WebElement SettingBtn;
	@FindBy(xpath="//div[@aria-label='Google apps']//li//span[contains(text(),'Gmail')]") private WebElement GmailBtn;
	@FindBy(xpath="//button[@class='bja J-I']") private WebElement InboxBtn;
	@FindBy(xpath="//div[@class='bsU']") private WebElement UnreadCount;

	
	public gmail_inbox(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void settingbtn()
	{
		SettingBtn.click();
	}
	public void gmailbtn()
	{
		GmailBtn.click();
	}
	public void inboxbtn()
	{
		InboxBtn.click();
	}
	public void unreadcount()
	{
		String s=UnreadCount.getText();
		System.out.println("unread messages= "+ s);
		
	}
	

	
	
//	driver.findElement(By.xpath("//a[@class='gb_A']")).click();
//	driver.switchTo().frame("app");
//	driver.findElement(By.xpath("//div[@aria-label='Google apps']//li//span[contains(text(),'Gmail')]")).click();
//	
//	 Set <String> windows = driver.getWindowHandles();
//	  Iterator <String> it = windows.iterator();
//	  String Window1 = it.next();
//	  String Window2 = it.next();
//	  driver.switchTo().window(Window2);
//	  
//	driver.findElement(By.xpath("//button[@class='bja J-I']")).click();
//	WebElement unread_msg = driver.findElement(By.xpath("//div[@class='bsU']"));
//	System.out.println("unread messages= "+ unread_msg.getText());
	
	
	
}
