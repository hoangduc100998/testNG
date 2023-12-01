package ducFinal.TestCases;

import TestNGFramework.BTHoanThien.Base.HTBaseSetup;
import TestNGFramework.BTHoanThien.PageObjects.HTClickTask;
import TestNGFramework.BTHoanThien.PageObjects.HTLoginPage;
import TestNGFramework.BTHoanThien.Utilities.HTPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class duc_TC01Login extends HTBaseSetup {
    public class TC01_LoginLogout extends HTBaseSetup {
        private WebDriver driver;
        private HTLoginPage htLoginPage;

        //private HTHomePage homePage;
        @BeforeClass
        public void setUp() {
            driver = getDriver();
            HTPropertiesFile.setPropertiesFile();
        }

        @Test(priority = 2)
        public void Test_Login() throws InterruptedException {
            HTLoginPage.Login(driver, HTPropertiesFile.getPropValue("username"),
                    HTPropertiesFile.getPropValue("password"));
        }


        @Test(priority = 3)
        public void Task() throws InterruptedException {
            HTClickTask.Task(driver, "Bug 1", "Bugggg", "28-11-2024", "24-11-2025");
        }
    }
}