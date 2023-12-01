package ducFinal.Actions.PageObjects;

import ducFinal.Actions.Commons.ducBasePage;
import ducFinal.Interfaces.ducHomePageUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ducHomePageObjects {
    private static WebElement element = null;
    //menu
    static ducBasePage basePage = new ducBasePage();
    //Page Actions
    public static void Logout(WebDriver driver){
        basePage.isElementDisplayed(driver,ducHomePageUI.xpathTextDashboard);
        basePage.clickToElement(driver,ducHomePageUI.xpathMenuProfile);
        basePage.clickToElement(driver, ducHomePageUI.xpathMenuLogOut);
    }
}

