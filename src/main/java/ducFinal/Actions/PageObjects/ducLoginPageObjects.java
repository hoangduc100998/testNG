package ducFinal.Actions.PageObjects;

import ducFinal.Actions.Commons.ducBasePage;
import ducFinal.Interfaces.ducLoginPageUI;
import org.openqa.selenium.WebDriver;

//Chua tất cả actions dưới dạng method đó: click/select/verify/getText
public class ducLoginPageObjects {

    WebDriver driver;
    private static ducBasePage basePage = new ducBasePage();
    //PageActions
    public static void Login(WebDriver driver , String username, String password) {
        basePage.sendKeyToElement(driver,ducLoginPageUI.xpathUserName,username);
        basePage.sendKeyToElement(driver,ducLoginPageUI.xpathPassword,password);
        basePage.clickToElement(driver, ducLoginPageUI.xpathLoginButton);

    }

}

