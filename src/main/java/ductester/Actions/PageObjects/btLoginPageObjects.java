package ductester.Actions.PageObjects;

import ductester.Actions.Commons.btBasePage;
import ductester.Interfaces.btLoginPageUI;
import org.openqa.selenium.WebDriver;

//Chua tất cả actions dưới dạng method đó: click/select/verify/getText
public class btLoginPageObjects {

    WebDriver driver;
    private static btBasePage basePage = new btBasePage();
    //PageActions
    public static void Login (WebDriver driver , String username, String password) {
        basePage.sendKeyToElement(driver, btLoginPageUI.xpathUserName,username);
        basePage.sendKeyToElement(driver, btLoginPageUI.xpathPassword,password);
        basePage.clickToElement(driver, btLoginPageUI.xpathLoginButton);
    }
}