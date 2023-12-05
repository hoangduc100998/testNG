//package ductester.Actions.pageObjects;
//
//import ductester.Interfaces.thiListPageUI;
//import ductester.Actions.commons.thiBasePage;
//import org.openqa.selenium.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class thiListPageObjects {
//    private static WebElement element = null;
//    static thiBasePage basePage=new thiBasePage();
//    public static void List (WebDriver driver, String bug, String comment1, String comment2) throws InterruptedException {
//        basePage.clickToElement(driver, thiListPageUI.Category);
//        Thread.sleep(500);
//        basePage.sendKeyToElement(driver, thiListPageUI.Search,bug);
//        basePage.sendKeyToElement(driver, thiListPageUI.Search, String.valueOf(Keys.ENTER));
//        Thread.sleep(500);
//        basePage.clickToElement(driver, thiListPageUI.detail);
//        basePage.sendKeyToElement(driver, thiListPageUI.cmt1, comment1);
//        basePage.clickToElement(driver, thiListPageUI.submit_cmt1);
//        Thread.sleep(500);
//        basePage.sendKeyToElement(driver, thiListPageUI.cmt2, comment2);
//        basePage.clickToElement(driver, thiListPageUI.submit_cmt2);
//        Thread.sleep(500);
//        basePage.clickToElement(driver, thiListPageUI.edit_status);
//        basePage.clickToElement(driver, thiListPageUI.click_Status);
//        basePage.clickToElement(driver, thiListPageUI.select_Status);
//        basePage.clickToElement(driver, thiListPageUI.Save1);
//    }
//}
