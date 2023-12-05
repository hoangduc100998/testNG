package ductester.Interfaces;
import ductester.Interfaces.thiLogoutPageUI;
import ductester.Interfaces.thiClickTaskUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class thiLogoutPageUI {
    private static WebElement element = null;
    WebDriver driver;

    public thiLogoutPageUI (WebDriver driver) {
        this.driver = driver;
    }

    //logout
    public static String click_avt = "//a[@id='user-dropdown']";
    public static String click_logout = "//a[normalize-space()='Sign Out']";
}
