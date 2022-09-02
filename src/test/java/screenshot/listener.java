package screenshot;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener extends screenshot implements ITestListener
{
public void TestStart(ITestResult r)
{
	System.out.println("test started..");
}
public void TestRun(ITestResult r)
{
	System.out.println("test running..");
}
public void TestFail(ITestResult r) throws IOException
{
	System.out.println("test fail..");
	screenshot();
}
}
