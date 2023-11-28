package TestNGFramework.C1BTTruyCapHomeWebsite.userActions;


import TestNGFramework.C1BTTruyCapHomeWebsite.pageObjects.HomePage;
import TestNGFramework.C1BTTruyCapHomeWebsite.pageObjects.LoginPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PageActions {
    public static void Login (WebDriver driver , String username, String password) {
        LoginPage.loadPage(driver);
        LoginPage.txtbx_UserName(driver).sendKeys(Keys.COMMAND,"a",username);
        LoginPage.txtbx_Password(driver).sendKeys(Keys.COMMAND,"a",password);
        LoginPage.btn_Login(driver).click();
    }
    public static void Dashboard (WebDriver driver) throws InterruptedException {
        Thread.sleep(500);
        HomePage.text_Dashboard(driver).isDisplayed();
    }

//    public static void HomePage(WebDriver driver){
//        ClientPage.click_client(driver).click();
//        ClientPage.menu_Profile(driver).click();
//        ClientPage.menu_LogOut(driver).click();
//    }
}
