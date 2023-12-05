package ductester.Actions.pageObjects;

import ductester.Actions.commons.thiBasePage;
import ductester.Actions.pageObjects.thiSearchPageObjects;
import ductester.Interfaces.thiSearchUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class thiSearchPageObjects {
    private static WebElement element = null;
    //menu
    static thiBasePage basePage = new thiBasePage();
    public static void thiSearchPageObjects (WebDriver driver) {

        driver.findElement(By.xpath(thiSearchUI.xpathPayment)).click();
        driver.findElement(By.xpath(thiSearchUI.xpathSearchPayment)).sendKeys("Duc Tester");
        //driver.findElement(By.xpath(thiSearchUI.xpathSearchOption2)).click();
    }
}
