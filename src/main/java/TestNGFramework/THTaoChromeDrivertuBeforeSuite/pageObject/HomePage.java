package TestNGFramework.THTaoChromeDrivertuBeforeSuite.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private static WebElement element = null;
    //menu
    public static WebElement text_Dashboard(WebDriver driver) throws NoSuchElementException {
        element = driver.findElement(By.xpath("//h4[text()='Dashboard']"));
        return element;
    }
}
