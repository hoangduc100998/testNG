package TestNGFramework.BTHoanThien.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HTHomePage {
    private static WebElement element = null;
    //menu
    WebDriver driver;
    public HTHomePage (WebDriver driver){
        this.driver=driver;
    }

    //Web locator
    static By text_Dashboard=By.xpath("//h6[text()='Dashboard']");
    public static WebElement text_Dashboard(WebDriver driver) throws NoSuchElementException {
        try{
            element = driver.findElement(text_Dashboard);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+ e.getMessage());
        }
        return element;
    }

    //Page Actions
    public static void Check (WebDriver driver){
        HTHomePage.text_Dashboard(driver).isDisplayed();
    }
}
