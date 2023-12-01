package ductester.Actions.PageObjects;

import ductester.Actions.Commons.btBasePage;
import ductester.Interfaces.btSearchUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class btSearchObjects {
    private static WebElement element = null;
    //menu
    static btBasePage basePage = new btBasePage();
    public static void Search (WebDriver driver, String title )
            throws InterruptedException {
    //Page Actions
        basePage.isElementDisplayed(driver, btSearchUI.add_title);

    };
}
