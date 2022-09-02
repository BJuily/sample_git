package gmail_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmail_user 
{
	@FindBy(xpath="//input[@id='identifierId']")private WebElement UserID;	
	@FindBy(xpath="(//button[@type='button'])[3]")private WebElement ClickBtn;	
	@FindBy(xpath="//input[@name='password']")private WebElement Password;	
	@FindBy(xpath="//div[@id='passwordNext']")private WebElement NextBtn;	
	
	
	public gmail_user(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void userid()
	{
		UserID.sendKeys("juily.m.borkar@apisero.com");
	}
	public void clickbtn()
	{
		ClickBtn.click();
	}
	public void password()
	{
		Password.sendKeys("9923108977");
	}
	public void nextbtn()
	{
		NextBtn.click();
	}
}
