package TestNGFramework.C1BTTruyCapHomeWebsite.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import TestNGFramework.C1THTaoChromeDrivertuBeforeSuite.userActions.*;

//@Listeners(TestListener.class)

public class UserAccessTest {
    private static WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
    }
    @Test (priority = 0)
    public void Test_Login() {
        //driver.manage().window().maximize();
        PageActions.Login(driver, "client@demo.com", "riseDemo");
    }
    @Test (priority = 1)
    public void Test_Home() throws InterruptedException {
        PageActions.Dashboard(driver);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
