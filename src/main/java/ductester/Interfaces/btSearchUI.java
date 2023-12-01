package ductester.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class btSearchUI {
    private static WebElement element = null;
    WebDriver driver;

    public btSearchUI(WebDriver driver) {
        this.driver = driver;
    }

    //Web locator
    public static String add_title = "//input[@type='search']";

}
