package ductester.Actions.pageObjects;

import ductester.Actions.commons.thiBasePage;
import ductester.Interfaces.thiClickTaskUI;
import ductester.Interfaces.thiLogoutPageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class thiLogoutPageObjects {
    private static WebElement element = null;
    private static thiBasePage basePage = new thiBasePage();

    //public static void Task (WebDriver driver, String title, String Des, String start, String deadline)
    public static void Logout (WebDriver driver)
            throws InterruptedException {
        Thread.sleep(1500);
        basePage.clickToElement(driver, thiLogoutPageUI.click_avt);
        Thread.sleep(1500);
        basePage.clickToElement(driver, thiLogoutPageUI.click_logout);
    }
}
