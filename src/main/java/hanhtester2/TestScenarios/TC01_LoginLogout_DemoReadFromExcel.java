package hanhtester2.TestScenarios;

import hanhtester2.Base.BaseSetup;
import hanhtester2.Listeners.TestListener;
import hanhtester2.PageObjects.HomePage;
import hanhtester2.PageObjects.LoginPage;
import hanhtester2.Utilities.ExcelHelpers;
import hanhtester2.Utilities.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static java.sql.DriverManager.getDriver;

@Listeners(TestListener.class)
public class TC01_LoginLogout_DemoReadFromExcel extends BaseSetup {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeClass
    public void setUp() {
        driver = getDriver();

    }


    @Test (priority = 0)
    public void Test_Login() throws Exception {
        //Setup đường dẫn của file excel
        ExcelHelpers excel=new ExcelHelpers();
        excel.setExcelFile("src/main/java/hanhtester2/Data/login.xlxs", "Sheet1");
        loginPage.Login(driver, excel.getCellData("username",2),excel.getCellData("password",2));
        Thread.sleep(1000);

    }
    @Test (priority = 1)
    public void Test_Logout(){
        homePage.Logout(driver);
    }
    @AfterTest
    public void afterTest() throws Exception {
        tearDown();
    }
}

