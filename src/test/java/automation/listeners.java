package automation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base;

public class listeners implements ITestListener  {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	Base bobject=new Base();
	

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		try {
			bobject.getScreenshot();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}

	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
				
	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
				
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
				
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
