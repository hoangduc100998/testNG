package ductester.Listerfaces;

import com.aventstack.extentreports.Status;
import ductester.ExtentReport.btTestManager;
import ductester.Logs.btLog;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static ducFinal.ExtentReport.ducExtentManager.getExtentReports;
public class btReportListener implements ITestListener {
    WebDriver driver;

    public String getTestName(ITestResult result) {
        return result.getTestName() != null ? result.getTestName()
                : result.getMethod().getConstructorOrMethod().getName();
    }

    public String getTestDescription(ITestResult result) {
        return result.getMethod().getDescription() != null ? result.getMethod().getDescription() : getTestName(result);
    }

//    @Override
//    public void onStart(ITestContext iTestContext) {
//        driver = ducBaseTest.getDriver();
//        ducLog.info("Start testing " + iTestContext.getName());
//        iTestContext.setAttribute("WebDriver", driver);
//    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        btLog.info("End testing " + iTestContext.getName());
        //Kết thúc và thực thi Extents Report
        getExtentReports().flush();
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        btLog.info(getTestName(iTestResult) + " test is starting...");
        btTestManager.saveToReport(iTestResult.getName(), iTestResult.getTestName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        btLog.info(getTestName(iTestResult) + " test is passed.");
        //ExtentReports log operation for passed tests.
        btTestManager.logMessage(Status.PASS, getTestDescription(iTestResult));
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        btLog.error(getTestName(iTestResult) + " test is failed.");

        btTestManager.addScreenShot(Status.FAIL, getTestName(iTestResult));

        btTestManager.logMessage(Status.FAIL, iTestResult.getThrowable().toString());
        btTestManager.logMessage(Status.FAIL, iTestResult.getName() + " is failed.");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        btLog.warn(getTestName(iTestResult) + " test is skipped.");
        btTestManager.logMessage(Status.SKIP, getTestName(iTestResult) + " test is skipped.");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        btLog.error("Test failed but it is in defined success ratio " + getTestName(iTestResult));
        btTestManager.logMessage("Test failed but it is in defined success ratio " + getTestName(iTestResult));
    }
}

