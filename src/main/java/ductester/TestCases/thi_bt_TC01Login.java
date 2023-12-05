package ductester.TestCases;
import ductester.Actions.commons.thiBaseTest;
import ductester.Actions.pageObjects.*;
import ductester.Interfaces.thiSearchUI;
//import ductester.Actions.pageObjects.HomePage;
import ductester.Actions.pageObjects.thiSearchPageObjects;
import ductester.Actions.pageObjects.thiAddTaskPageObjects;
import ductester.Utilities.Helpers.thiPropertiesFile;
import ductester.Utilities.Listeners.thiReportListener;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
public class thi_bt_TC01Login {
    @Listeners(thiReportListener.class)
    public class TC01_Config extends thiBaseTest {
        //ExtentReports extent=new ExtentReports();
        //ExtentSparkReporter spark=new ExtentSparkReporter("ExtentReport.html");
        private WebDriver driver;

        @BeforeClass
        public void setUp() {
            driver = getDriver();
            thiPropertiesFile.setPropertiesFile();
            //extent.attachReporter(spark);
        }

        @Test(priority = 0)
        public void Login() {
            thiLoginPageObjects.Login(driver, thiPropertiesFile.getPropValue("username"),
                    thiPropertiesFile.getPropValue("password"));
//        ExtentTest test=extent.createTest("Verify log in");
//        test.log(Status.PASS,"user login");
//        test.pass("login verified");
        }

        @Test(priority = 1)
        public void ClickSales () throws InterruptedException {
            thiClickTaskObjects.ClickSales(driver);
            //thiClickTaskObjects.Task(driver);
        }
        @Test(priority = 2)
        public void addPayment () {
            thiAddTaskPageObjects.thiaddPayment(driver);
            //thiClickTaskObjects.Task(driver);
        }

        @Test(priority = 3)
        public void SearchUI ()  {
            thiSearchPageObjects.thiSearchPageObjects(driver);
        }


        @Test(priority = 10)
        public void Logout () throws InterruptedException {
            thiLogoutPageObjects.Logout(driver);
        }

        @AfterClass
        public void afterTest() throws Exception {
            tearDown();
            //extent.flush();
        }
    }
}
