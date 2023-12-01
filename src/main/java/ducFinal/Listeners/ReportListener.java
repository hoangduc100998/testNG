package ducFinal.Listeners;


import ducFinal.ExtentReport.ducExtentTestManager;
import ducFinal.Logs.ducLog;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static ducFinal.ExtentReport.ducExtentManager.getExtentReports;
public class ReportListener implements ITestListener {
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
        ducLog.info("End testing " + iTestContext.getName());
        //Kết thúc và thực thi Extents Report
        getExtentReports().flush();
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        ducLog.info(getTestName(iTestResult) + " test is starting...");
        ducExtentTestManager.saveToReport(iTestResult.getName(), iTestResult.getTestName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        ducLog.info(getTestName(iTestResult) + " test is passed.");
        //ExtentReports log operation for passed tests.
        ducExtentTestManager.logMessage(Status.PASS, getTestDescription(iTestResult));
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        ducLog.error(getTestName(iTestResult) + " test is failed.");

        ducExtentTestManager.addScreenShot(Status.FAIL, getTestName(iTestResult));

        ducExtentTestManager.logMessage(Status.FAIL, iTestResult.getThrowable().toString());
        ducExtentTestManager.logMessage(Status.FAIL, iTestResult.getName() + " is failed.");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        ducLog.warn(getTestName(iTestResult) + " test is skipped.");
        ducExtentTestManager.logMessage(Status.SKIP, getTestName(iTestResult) + " test is skipped.");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        ducLog.error("Test failed but it is in defined success ratio " + getTestName(iTestResult));
        ducExtentTestManager.logMessage("Test failed but it is in defined success ratio " + getTestName(iTestResult));
    }
}
