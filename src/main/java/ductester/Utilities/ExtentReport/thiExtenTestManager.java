package ductester.Utilities.ExtentReport;
import ductester.Actions.commons.thiBaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.util.HashMap;
import java.util.Map;

//Khởi tạo report
public class thiExtenTestManager {
    static Map<Integer, ExtentTest> extentTestMap = new HashMap<>();
    static ExtentReports extent = thiExtentManager.getExtentReports();


    public static ExtentTest getTest() {
        //extentTestMap lưu giữ thông tin của id luồng và các c thể ExtentTest
        return extentTestMap.get((int) Thread.currentThread().getId());
    }

    public static synchronized ExtentTest saveToReport(String testName, String desc) {
        ExtentTest test = extent.createTest(testName, desc);
        extentTestMap.put((int) Thread.currentThread().getId(), test);
        return test;
    }

    public WebDriver getDriver() {
        WebDriver driver = thiBaseTest.getDriver();
        return driver;
    }

    public static void addScreenShot (String message) {
        String base64Image = "data:image/png;base64,"
                + ((TakesScreenshot) thiBaseTest.getDriver()).getScreenshotAs(OutputType.BASE64);
        getTest().log(Status.INFO, message,        MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());
    }

    public static void addScreenShot (Status status, String message) {

        String base64Image = "data:image/png;base64,"
                + ((TakesScreenshot) thiBaseTest.getDriver()).getScreenshotAs(OutputType.BASE64);
        getTest().log(status, message,               MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build());
    }

    public static void logMessage(String message) {
        getTest().log(Status.INFO, message);
    }

    public static void logMessage(Status status, String message) {
        getTest().log(status, message);
    }

}
