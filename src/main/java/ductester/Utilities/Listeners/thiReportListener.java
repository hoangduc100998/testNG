package ductester.Utilities.Listeners;

import ductester.Actions.commons.thiBaseTest;
import ductester.Utilities.ExtentReport.thiExtenTestManager;
import ductester.Utilities.Logs.thiLog;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import static ductester.Utilities.ExtentReport.thiExtentManager.getExtentReports;
public class thiReportListener implements ITestListener {
    WebDriver driver;

    public String getTestName(ITestResult result) {
        return result.getTestName() != null ? result.getTestName()
                : result.getMethod().getConstructorOrMethod().getName();
    }
    public String getTestDescription(ITestResult result) {
        return result.getMethod().getDescription() != null ? result.getMethod().getDescription() : getTestName(result);
    }
    @Override
    public void onStart(ITestContext iTestContext) {
        driver = thiBaseTest.getDriver();
        thiLog.info("Start testing " + iTestContext.getName());
        iTestContext.setAttribute("WebDriver", driver);
        //Gọi hàm startRecord video trong CaptureHelpers class
//        try {
//            CaptureHelpers.startRecord(iTestContext.getName());
//            //CaptureHelpers.captureScreenshot(driver,iTestContext.getName());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        thiLog.info("End testing " + iTestContext.getName());
        //Kết thúc và thực thi Extents Report
        getExtentReports().flush();
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        thiLog.info(getTestName(iTestResult) + " test is starting...");
        thiExtenTestManager.saveToReport(iTestResult.getName(), iTestResult.getTestName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        thiLog.info(getTestName(iTestResult) + " test is passed.");
        //ExtentReports log operation for passed tests.
        thiExtenTestManager.logMessage(Status.PASS, getTestDescription(iTestResult));
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        thiLog.error(getTestName(iTestResult) + " test is failed.");

        thiExtenTestManager.addScreenShot(Status.FAIL, getTestName(iTestResult));

        thiExtenTestManager.logMessage(Status.FAIL, iTestResult.getThrowable().toString());
        thiExtenTestManager.logMessage(Status.FAIL, iTestResult.getName() + " is failed.");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        thiLog.warn(getTestName(iTestResult) + " test is skipped.");
        thiExtenTestManager.logMessage(Status.SKIP, getTestName(iTestResult) + " test is skipped.");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        thiLog.error("Test failed but it is in defined success ratio " + getTestName(iTestResult));
        thiExtenTestManager.logMessage("Test failed but it is in defined success ratio " + getTestName(iTestResult));
    }
}
