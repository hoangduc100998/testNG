package TestNGFramework.BTHoanThien.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HTClickTask {
    private static WebElement element = null;
    WebDriver driver;
    public HTClickTask (WebDriver driver){
        this.driver=driver;
    }
    //Web locator
    static By click_Tasks = By.xpath("//span[text()='Tasks']");
    static By click_add = By.xpath("//a[text()=' Add task']");
    static By add_title = By.xpath("//input[@id='title']");
    static By add_Description = By.xpath("//textarea[@id='description']");
    static By click_Related = By.xpath("//label[text()='Related to']/following::div[@id='s2id_task-context']");
    static By select_Related = By.xpath("//div[text()='Client']");
    static By click_Contract = By.xpath("//label[text()='Related to']/following::div[@id='s2id_client_id']");
    static By select_Contract = By.xpath("//div[text()='Demo Client']");
    static By click_Point = By.xpath("//label[text()='Points                        ']/following::div[@id='s2id_autogen18']");
    static By select_Point = By.xpath("//div[text()='2 Points']");
    static By click_Assign = By.xpath("//label[text()='Assign to']/following::div[@id='s2id_assigned_to']");
    static By select_Assign = By.xpath("//div[text()='Michael Wood']");
    static By click_Collaborators = By.xpath("//label[text()='Collaborators']/following::div[@id='s2id_collaborators']");
    static By select_Collaborators = By.xpath("//div[text()='Sara Ann']");
    static By click_Status = By.xpath("//label[text()='Status']/following::div[@id='s2id_task_status_id']");
    static By select_Status = By.xpath("//div[text()='To do']");
    static By click_Priority = By.xpath("//label[text()='Priority']/following::div[@id='s2id_priority_id']");
    static By select_Priority = By.xpath("//div[text()='Major']");
    static By click_Labels = By.xpath("//label[text()='Labels']/following::div[@id='s2id_project_labels']");
    static By select_Labels = By.xpath("//div[text()='Bug']");
    static By start_date = By.xpath("//input[@name='start_date']");
    static By deadline = By.xpath("//input[@name='deadline']");
    static By Recurring = By.xpath("(//input[@type='checkbox'])[3]");
    static By Save = By.xpath("//button[text()=' Save']");

    public static WebElement click_Tasks(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(click_Tasks);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }

    public static WebElement click_add(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(click_add);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement add_title(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(add_title);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement add_Description(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(add_Description);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement click_Related(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(click_Related);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement select_Related(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(select_Related);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement click_Contract(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(click_Contract);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement select_Contract(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(select_Contract);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement click_Point(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(click_Point);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement select_Point(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(select_Point);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement click_Assign(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(click_Assign);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement select_Assign(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(select_Assign);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement click_Collaborators(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(click_Collaborators);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement select_Collaborators(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(select_Collaborators);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement click_Status(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(click_Status);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement select_Status(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(select_Status);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement click_Priority(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(click_Priority);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement select_Priority(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(select_Priority);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement click_Labels(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(click_Labels);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement select_Labels(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(select_Labels);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement start_date(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(start_date);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement deadline(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(deadline);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement Recurring(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(Recurring);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }
    public static WebElement Save(WebDriver driver) throws NoSuchElementException{
        try{
            element = driver.findElement(Save);
        }catch (Exception e){
            System.out.println("Exceptions Caught"+e.getMessage());
        }
        return element;
    }

    public static void Task(WebDriver driver, String title, String Des, String start, String deadline ) throws InterruptedException {
        HTClickTask.click_Tasks(driver).click();
        HTClickTask.click_add(driver).click();
        HTClickTask.add_title(driver).sendKeys(title);
        HTClickTask.add_Description(driver).sendKeys(Des);
        HTClickTask.click_Related(driver).click();
        HTClickTask.select_Related(driver).click();

        Thread.sleep(500);

        HTClickTask.click_Contract(driver).click();
        HTClickTask.select_Contract(driver).click();
        HTClickTask.click_Point(driver).click();
        HTClickTask.select_Point(driver).click();
        HTClickTask.click_Assign(driver).click();
        HTClickTask.select_Assign(driver).click();
        HTClickTask.click_Collaborators(driver).click();
        HTClickTask.select_Collaborators(driver).click();
        HTClickTask.click_Status(driver).click();
        HTClickTask.select_Status(driver).click();
        HTClickTask.click_Priority(driver).click();
        HTClickTask.select_Priority(driver).click();
        HTClickTask.click_Labels(driver).click();
        HTClickTask.select_Labels(driver).click();
        HTClickTask.start_date(driver).sendKeys(start);
        HTClickTask.deadline(driver).sendKeys(deadline);
        HTClickTask.Recurring(driver).click();
        HTClickTask.Save(driver).click();
    }
}
