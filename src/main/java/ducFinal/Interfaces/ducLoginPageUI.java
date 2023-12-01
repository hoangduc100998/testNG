package ducFinal.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Chứa tất cả actions dưới dạng method đó: click/select/verify/getText
public class ducLoginPageUI {
    private static WebElement element = null;
    WebDriver driver;
    public ducLoginPageUI (WebDriver driver){
        this.driver=driver;
    }
    //Web locator
    public static String xpathUserName="//input[@placeholder='Username']";
    public static String xpathPassword="//input[@placeholder='Password']";
    public static String xpathLoginButton="//button[@type='submit']";

}

