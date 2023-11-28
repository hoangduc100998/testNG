package TestNGFramework.BTHoanThien.TestScenarios;

import TestNGFramework.BTHoanThien.Base.HTBaseSetup;
import TestNGFramework.BTHoanThien.Listeners.HTTestListener;
import TestNGFramework.BTHoanThien.PageObjects.HTClickTask;
import TestNGFramework.BTHoanThien.PageObjects.HTHomePage;
import TestNGFramework.BTHoanThien.PageObjects.HTLoginPage;

import TestNGFramework.BTHoanThien.Utilities.HTPropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Listeners(HTTestListener.class)
public class HT_TC01Login extends HTBaseSetup {
    public class TC01_LoginLogout extends HTBaseSetup {
        private WebDriver driver;
        private HTLoginPage htLoginPage;
        //private HTHomePage homePage;
        @BeforeClass
        public void setUp() {
            driver = getDriver();
            HTPropertiesFile.setPropertiesFile();
        }
        @Test(priority = 0)
        public void CMD_A () {
            WebElement datePicker=driver.findElement(By.xpath("//input[@placeholder='Email']"));
            //Press Ctrl-A
            String s = Keys.chord(Keys.COMMAND, "a");
            datePicker.sendKeys(s);
        }
        @Test(priority = 1)
        public void CMD_A2 () {
            WebElement datePicker=driver.findElement(By.xpath("//input[@placeholder='Password']"));
            //Press Ctrl-A
            String s = Keys.chord(Keys.COMMAND, "a");
            datePicker.sendKeys(s);
        }
        @Test (priority = 2)
        public void Test_Login() {
            HTLoginPage.Login(driver, HTPropertiesFile.getPropValue("username"),
                    HTPropertiesFile.getPropValue("password"));
        }
        @Test(priority = 3)
        public void Task () throws InterruptedException {
            HTClickTask.Task(driver, "Bug 1", "Bugggg", "28-11-2024", "24-11-2025" );
        }
    }
}