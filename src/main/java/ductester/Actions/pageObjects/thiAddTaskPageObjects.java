package ductester.Actions.pageObjects;
import ductester.Actions.commons.thiBasePage;
import ductester.Interfaces.thiAddTaskUI;
import ductester.Interfaces.thiAddTaskUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;
import java.time.Duration;

public class thiAddTaskPageObjects {
    private static WebElement element = null;
    //menu
    static thiBasePage basePage = new thiBasePage();
    public static void thiaddPayment(WebDriver driver) {
        driver.findElement(By.xpath(thiAddTaskUI.xpathBtnAddPayment)).click();
        driver.findElement(By.xpath(thiAddTaskUI.xpathInvoice)).click();
        driver.findElement(By.xpath(thiAddTaskUI.xpathInvoiceOptions)).click();
        driver.findElement(By.xpath(thiAddTaskUI.xpathAmount)).sendKeys("19000");
        driver.findElement(By.xpath(thiAddTaskUI.xpathNote)).sendKeys("Duc Tester1");
        driver.findElement(By.xpath(thiAddTaskUI.xpathBtnSave)).click();
        driver.findElement(By.xpath(thiAddTaskUI.xpathPayment)).click();
        driver.findElement(By.xpath(thiAddTaskUI.xpathPayment)).sendKeys("Duc Tester2");
        driver.findElement(By.xpath(thiAddTaskUI.xpathSearchOption)).click();
    }
}














//
//public class thiAddTaskPageObjects {
//    private static WebElement element = null;
//    private static thiBasePage basePage = new thiBasePage();
//
//    //public static void Task (WebDriver driver, String title, String Des, String start, String deadline)
//    public static void Task (WebDriver driver, String billdate, String duebill )
//            throws InterruptedException {
//
//        basePage.isElementDisplayed(driver, thiAddTaskUI.check_Task);
//        basePage.clickToElement(driver, thiAddTaskUI.click_Invoicetask);
//        basePage.sendKeyToElement(driver, thiAddTaskUI.click_billdate, billdate);
//        basePage.sendKeyToElement(driver, thiAddTaskUI.click_duebill, duebill);
//
//        basePage.clickToElement(driver, thiAddTaskUI.click_Client);
//        basePage.clickToElement(driver, thiAddTaskUI.select_Client;
//
//        basePage.clickToElement(driver, thiAddTaskUI.click_Project);
//        basePage.clickToElement(driver, thiAddTaskUI.select_Project);
//
//        //basePage.clickToElement(driver, thiAddTaskUI.add_note);
//
//    }
//}

//
//        basePage.sendKeyToElement(driver,thiAddTaskUI.add_title,title);
//        basePage.sendKeyToElement(driver,thiAddTaskUI.add_Description,Des);
//        Thread.sleep(300);
//        basePage.clickToElement(driver, thiAddTaskUI.click_Related);
//        basePage.clickToElement(driver, thiAddTaskUI.select_Related);
//        Thread.sleep(300);
//
//
//        //basePage.clickToElement(driver, thiAddTaskUI.click_Contract);
//        //basePage.clickToElement(driver, thiAddTaskUI.select_Contract);
//
//        basePage.selectItemInCustomDropdown
//                (driver, thiAddTaskUI.click_Contract, thiAddTaskUI.select_Contract,);
//        Thread.sleep(300);
//        //basePage.clickToElement(driver, thiAddTaskUI.click_Point);
//        Thread.sleep(300);
//        //basePage.clickToElement(driver, thiAddTaskUI.select_Point);
//        basePage.selectItemInCustomDropdown
//                (driver,thiAddTaskUI.click_Point, thiAddTaskUI.select_Point, "4 Points");
//
//
//        basePage.clickToElement(driver, thiAddTaskUI.click_Assign);
//        basePage.clickToElement(driver, thiAddTaskUI.select_Assign);
//        basePage.clickToElement(driver, thiAddTaskUI.click_Collaborators);
//        basePage.clickToElement(driver, thiAddTaskUI.select_Collaborators);
//        basePage.clickToElement(driver, thiAddTaskUI.click_Status);
//        basePage.clickToElement(driver, thiAddTaskUI.select_Status);
//        basePage.clickToElement(driver, thiAddTaskUI.click_Priority);
//        basePage.clickToElement(driver, thiAddTaskUI.select_Priority);
//        basePage.clickToElement(driver, thiAddTaskUI.click_Labels);
//        basePage.clickToElement(driver, thiAddTaskUI.select_Labels);
//        basePage.sendKeyToElement(driver,thiAddTaskUI.start_date,start);
//        basePage.sendKeyToElement(driver,thiAddTaskUI.deadline,deadline);
//        basePage.clickToElement(driver, thiAddTaskUI.Recurring);
//        basePage.clickToElement(driver, thiAddTaskUI.Save);
//    }
//}
