package RetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerClass implements IRetryAnalyzer 
{
 int RetryCount=0;
 int MaxCount=3;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(RetryCount<MaxCount)
		{
			RetryCount++;
			return true;
		}
		return false;
	}

}
