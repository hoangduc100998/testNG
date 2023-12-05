package ductester.Interfaces;
import ductester.Actions.pageObjects.thiSearchPageObjects;
import ductester.Interfaces.thiSearchUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class thiSearchUI {
    private static WebElement element = null;
    //menu
    WebDriver driver;

    public thiSearchUI(WebDriver driver) {this.driver = driver; }

    public static String xpathPayment="//span[text()='Payments']";

    public static String xpathSearchPayment = "//input[@placeholder='Search']\n";
    //public static String xpathSearchOption2 = "//a[normalize-space()='INVOICE #33']\n";
}




