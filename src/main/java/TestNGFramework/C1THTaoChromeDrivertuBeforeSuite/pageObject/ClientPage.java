package TestNGFramework.C1THTaoChromeDrivertuBeforeSuite.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientPage {
    private static WebElement element = null;
    //menu
    public static WebElement click_client (WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//span[text()='Clients']"));
        return element;
    }
    public static WebElement menu_Profile(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//a[@id='user-dropdown']"));
        return element;
    }
    public static WebElement menu_LogOut(WebDriver driver) throws NoSuchElementException{
        element = driver.findElement(By.xpath("//a[text()=' Sign Out']"));
        return element;
    }
}
