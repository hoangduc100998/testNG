package ductester.TestCases;

import TestNGFramework.BTHoanThien.PageObjects.HTClickTask;
import ductester.Actions.Commons.btBaseTest;
import ductester.Interfaces.btLoginPageUI;
import ductester.Actions.PageObjects.btClickTaskObject;
import ductester.Actions.PageObjects.btLoginPageObjects;
import ductester.Actions.PageObjects.btHomePageObjects;
import ductester.Utilities.Helpers.PropertiesFile;
import ductester.Utilities.Listeners.ReportListener;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static ductester.Actions.Commons.btBaseTest.getDriver;
@Listeners(ReportListener.class)
public class bt_TC01Login extends btBaseTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = getDriver();
        PropertiesFile.setPropertiesFile();
        //extent.attachReporter(spark);

    }

    @Test(priority = 0)
    public void Test_Login() {
        btLoginPageObjects.Login(driver, PropertiesFile.getPropValue("username"), PropertiesFile.getPropValue("password"));
//        ExtentTest test=extent.createTest("Verify log in");
//        test.log(Status.PASS,"user login");
//        test.pass("login verified");
    }

    @Test(priority = 1)
    public void Task() throws InterruptedException {
        btClickTaskObject.Task(driver, "Bug 1", "Bugggg", "28-11-2024", "24-11-2025");
    }

//    @Test(priority = 2)
//    public void Search() throws InterruptedException {
//        btClickTaskObject.Task(driver, "Bug 1");
//    }

    @Test(priority = 3)
    public void Test_Logout() throws InterruptedException {
        btHomePageObjects.Logout(driver);
    }
    @AfterClass
    public void afterTest() throws Exception {
        tearDown();
        //extent.flush();
    }
}