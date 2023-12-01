package ductester.Interfaces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class btHomePageUI {
    private static WebElement element = null;
    //menu
    WebDriver driver;
    public btHomePageUI(WebDriver driver){
        this.driver=driver;
    }

    //Web locator
    public static String xpathTextDashboard="//h4[text()='Tasks']";
    public static String xpathMenuProfile="//span[@class='avatar-xs avatar me-1']";
    public static String xpathMenuLogOut="//a[text()=' Sign Out']";
}