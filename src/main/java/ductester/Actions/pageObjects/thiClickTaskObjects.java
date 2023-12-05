package ductester.Actions.pageObjects;

import ductester.Actions.commons.thiBasePage;
import ductester.Actions.commons.thiBasePage;
import ductester.Interfaces.thiLoginPageUI;
import ductester.Interfaces.thiClickTaskUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class thiClickTaskObjects {
    private static WebElement element = null;
    private static thiBasePage basePage = new thiBasePage();

    //public static void Task (WebDriver driver, String title, String Des, String start, String deadline)
    public static void ClickSales (WebDriver driver)
            throws InterruptedException {

        //basePage.isElementDisplayed(driver, thiClickTaskUI.check_Dashboard);
        Thread.sleep(1500);
        basePage.clickToElement(driver, thiClickTaskUI.click_Sales);
        basePage.clickToElement(driver, thiClickTaskUI.click_Invoices);
    }
}


