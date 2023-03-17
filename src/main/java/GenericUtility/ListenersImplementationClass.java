package GenericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementationClass implements ITestListener {

	ExtentReports report;
	ExtentTest test;
	JavaUtility jUtil=new JavaUtility();
	WebDriverUtility wUtil=new WebDriverUtility();
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		 String methodName = result.getMethod().getMethodName();
		 test=report.createTest(methodName);
		 test.log(Status.INFO, "Test Start");
		 System.out.println("==== "+methodName+" Excution Start====");
		 
		 
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		 String methodName = result.getMethod().getMethodName();
		 test.log(Status.INFO, "Test pass"+methodName);
		 System.out.println("==== "+methodName+" Excution success====");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		 String methodName = result.getMethod().getMethodName();
		 test.log(Status.FAIL, "Test Fail"+methodName);
		 test.log(Status.FAIL, result.getThrowable());
		 String ScreenShotNmae=methodName+"-"+jUtil.getSystemdateFormate();
		 try {
			String path = wUtil.takeScreenShot(BaseClass.sdriver, ScreenShotNmae);
			test.addScreenCaptureFromBase64String(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
//		 System.out.println("==== "+methodName+" Excution Fail====");
//		 System.out.println(result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		 String methodName = result.getMethod().getMethodName();
		 test=report.createTest(methodName);
		 test.log(Status.SKIP, "Test Start");
		 test.log(Status.SKIP, result.getThrowable());
		 String ScreenShotNmae=methodName+"-"+jUtil.getSystemdateFormate();
		 try {
			String path = wUtil.takeScreenShot(BaseClass.sdriver, ScreenShotNmae);
			test.addScreenCaptureFromBase64String(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		 System.out.println("==== "+methodName+" Excution Skip====");
//		 System.out.println(result.getThrowable());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		 
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Execution Start");
		
		ExtentSparkReporter htmlreport=new ExtentSparkReporter(".\\ExtendReportes\\Report"+new JavaUtility().getSystemdateFormate());
		htmlreport.config().setDocumentTitle("Vtiger Application");
		htmlreport.config().setReportName("Vtiger Execution report");
		htmlreport.config().setTheme(Theme.DARK);
		
		
		 report=new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("Base Url", " http://localhost:8888");
		report.setSystemInfo("Base Browser","FireFox");
		report.setSystemInfo("Reporter Name", "Pratap");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Execution End");
		report.flush();
	}
	
	

}
 