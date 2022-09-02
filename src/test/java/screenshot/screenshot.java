package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import config.config;
import gmail_task.base_class;

public class screenshot extends base_class
{
public void screenshot() throws IOException
{
	File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\juilymborkar\\eclipse-workspace\\gmail_task\\target\\screenshot\\test_fail"+".jpg");
	FileHandler.copy(source,destination);

}}
