package ductester.Actions.PageObjects;

import ductester.Actions.Commons.btBasePage;
import ductester.Interfaces.btHomePageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class btHomePageObjects {
    private static WebElement element = null;
    //menu
    static btBasePage basePage = new btBasePage();
    //Page Actions
    public static void Logout(WebDriver driver){
        basePage.isElementDisplayed(driver, btHomePageUI.xpathTextDashboard);
        basePage.clickToElement(driver, btHomePageUI.xpathMenuProfile);
        basePage.clickToElement(driver, btHomePageUI.xpathMenuLogOut);
    }
}
