package TestNGFramework.THTaoChromeDrivertuBeforeSuite.testcases;

//import TestNGFramework.THTaoChromeDrivertuBeforeSuite.commons.TestListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import hanhtester.pageObject.*;
import TestNGFramework.THTaoChromeDrivertuBeforeSuite.userActions.*;

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
        PageActions.Login(driver, "Admin", "admin123");
    }
    @Test (priority = 1)
    public void Test_Home() throws InterruptedException {
        PageActions.Dashboard(driver);
    }

    @Test (priority = 2)
    public void Test_Client() throws InterruptedException {
        PageActions.Client(driver);

    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
