package ductester.Actions.PageObjects;

import ductester.Actions.Commons.btBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ductester.Interfaces.btClickTaskUI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class btClickTaskObject {
    private static WebElement element = null;
    //menu
    static btBasePage basePage = new btBasePage();
    public static void Task (WebDriver driver, String title, String Des, String start, String deadline )
            throws InterruptedException {

        basePage.clickToElement(driver, btClickTaskUI.click_Tasks);

        basePage.clickToElement(driver, btClickTaskUI.click_add);
        basePage.sendKeyToElement(driver, btClickTaskUI.add_title, title);
        basePage.sendKeyToElement(driver, btClickTaskUI.add_Description, Des);
        basePage.clickToElement(driver, btClickTaskUI.click_Related);
        basePage.clickToElement(driver, btClickTaskUI.select_Related);
        Thread.sleep(500);
        basePage.clickToElement(driver, btClickTaskUI.click_Contract);
        basePage.clickToElement(driver, btClickTaskUI.select_Contract);
        basePage.clickToElement(driver, btClickTaskUI.click_Point);
        basePage.clickToElement(driver, btClickTaskUI.select_Point);
        basePage.clickToElement(driver, btClickTaskUI.click_Assign);
        basePage.clickToElement(driver, btClickTaskUI.select_Assign);
        basePage.clickToElement(driver, btClickTaskUI.click_Collaborators);
        basePage.clickToElement(driver, btClickTaskUI.select_Collaborators);
        basePage.clickToElement(driver, btClickTaskUI.click_Status);
        basePage.clickToElement(driver, btClickTaskUI.select_Status);
        basePage.clickToElement(driver, btClickTaskUI.click_Priority);
        basePage.clickToElement(driver, btClickTaskUI.select_Priority);
        basePage.clickToElement(driver, btClickTaskUI.click_Labels);
        basePage.clickToElement(driver, btClickTaskUI.select_Labels);
        basePage.sendKeyToElement(driver, btClickTaskUI.start_date, start);
        basePage.sendKeyToElement(driver, btClickTaskUI.deadline, deadline);
        basePage.clickToElement(driver, btClickTaskUI.Recurring);
        basePage.clickToElement(driver, btClickTaskUI.Save);


    }
}
