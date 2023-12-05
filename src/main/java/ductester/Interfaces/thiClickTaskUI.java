package ductester.Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class thiClickTaskUI {
    private static WebElement element = null;
    WebDriver driver;

    public thiClickTaskUI (WebDriver driver) {
        this.driver = driver;
    }
    //Web locator
    //check chu dasbord
    //public static String check_Dashboard = "//h4[@class='float-start']";

    //Kich vao task - Hanh dong
    public static String click_Sales ="//span[text()='Sales']";

    //kich invoices
    public static String click_Invoices ="//span[text()='Invoices']";
}

