package TestNGFramework.BTHoanThien.PageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HTLoginPage {
    private static WebElement element = null;
    WebDriver driver;
    public HTLoginPage (WebDriver driver){
        this.driver=driver;
    }

    //Phải tìm xpath để nó điền
    static By txtbx_UserName=By.xpath("//input[@placeholder='Email']");
    static By txtbx_Password=By.xpath("//input[@placeholder='Password']");
    static By btn_Login=By.xpath("//button[@type='submit']");

    //Text fields
    public static WebElement UserName(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(txtbx_UserName);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement Password (WebDriver driver) throws NoSuchElementException{
        try {
            element = driver.findElement(txtbx_Password);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    // Buttons
    public static WebElement button_Login(WebDriver driver) throws NoSuchElementException{
        try {
            element = driver.findElement(btn_Login);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+ e.getMessage());
        }
        return element;
    }
    //Hành động mà tools làm, nhập username, passwpord xong click login
    public static void Login (WebDriver driver , String username, String password) {
//        HTLoginPage.UserName(driver).sendKeys(username);
//        HTLoginPage.Password(driver).sendKeys(password);
        HTLoginPage.button_Login(driver).click();
    }
}

