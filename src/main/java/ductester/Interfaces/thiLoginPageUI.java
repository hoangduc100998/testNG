package ductester.Interfaces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class thiLoginPageUI {
    private static WebElement element = null;
    WebDriver driver;
    public thiLoginPageUI (WebDriver driver){

        this.driver=driver;
    }
    //Web locator
    public static String xpathUserName="//input[@placeholder='Email']";
    public static String xpathPassword="//input[@placeholder='Password']";
    public static String xpathLoginButton="//button[@type='submit']";

}
