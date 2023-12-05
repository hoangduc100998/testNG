package ductester.Actions.pageObjects;

import ductester.Actions.commons.thiBasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import ductester.Interfaces.thiLoginPageUI;
import org.openqa.selenium.WebElement;

public class thiLoginPageObjects {

    WebDriver driver;
    private static thiBasePage basePage = new thiBasePage();
    //PageActions
    public static void Login (WebDriver driver , String username, String password) {
        basePage.sendKeyToElement(driver,thiLoginPageUI.xpathUserName,username);
        basePage.sendKeyToElement(driver,thiLoginPageUI.xpathPassword,password);
        basePage.clickToElement(driver,thiLoginPageUI.xpathLoginButton);
    }
}
