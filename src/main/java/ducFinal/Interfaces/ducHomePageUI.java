package ducFinal.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ducHomePageUI {
    private static WebElement element = null;
    //menu
    WebDriver driver;
    public ducHomePageUI(WebDriver driver){
        this.driver=driver;
    }

    //Web locator
    public static String xpathTextDashboard="//h6[text()='Dashboard']";
    public static String xpathMenuProfile="//span[@class='oxd-userdropdown-tab']";
    public static String xpathMenuLogOut="//a[text()='Logout']";
}

