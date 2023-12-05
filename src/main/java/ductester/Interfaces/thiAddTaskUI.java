package ductester.Interfaces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class thiAddTaskUI {
    private static WebElement element = null;
    //menu
    WebDriver driver;
    public thiAddTaskUI (WebDriver driver){
        this.driver=driver;
    }
    public static String xpathBtnAddPayment="//a[@class='btn btn-default mb0'][normalize-space()='Add payment']";
    public static String xpathInvoice="//div[@class='select2-container select2 validate-hidden']";
    public static String xpathInvoiceOptions="//div[text()=\"INVOICE #32\"]";
    public static String xpathAmount="//input[@id='invoice_payment_amount']";
    public static String xpathNote="//textarea[@id='invoice_payment_note']";

    public static String xpathPayment="//span[text()='Payments']";
    public static String xpathSearchOption="//a[normalize-space()='INVOICE #32']\n";

    public static String xpathBtnSave="//button[normalize-space()='Save']\n";

}























//
//public class thiAddTaskUI {
//    private static WebElement element = null;
//    WebDriver driver;
//
//    public thiAddTaskUI l(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    //Check coi co hien Tasks khong
//    public static String check_Task = "//h4[@class='pl15 pt10 pr15']";
//    public static String click_Invoicetask = "//a[text()=' Add invoice']";
//    public static String click_billdate = "//input[@id='invoice_bill_date']";
//
//    public static String click_duebill = "//input[@id='invoice_due_date']";
//
//    public static String click_Client = "//span[@id='select2-chosen-119']";
//    public static String select_Client = "//div[text()='Abe Bogisich ']";
//
//    public static String click_Project = "//span[@id='select2-chosen-172']";
//    public static String select_Project = "//div[text()='Infographic Creation and Visualizations ']";
//
//
//    //public static String add_note = "//input[@id='title']";













//
//    public static String add_title = "//input[@id='title']";
//    public static String add_Description = "//textarea[@id='description']";
//    //Kích vào cái bảng chọn để chọn
//    public static String click_Related = "//label[text()='Related to']/following::div[@id='s2id_task-context']";
//    //chọn option Contract
//    public static String select_Related = "//div[text()='Client']";
//
//    //Kích Client và chọn Demo Client
//    public static String click_Contract = "//label[text()='Related to']/following::div[@id='s2id_client_id']";
//    public static String select_Contract = "//div[text()='Hauck Ltd']";
//    //Kích Point và chọn 2 Points
//    public static String click_Point =
//            "//label[text()='Points                        ']/following::div[@id='s2id_autogen18']";
//    public static String select_Point = "//div[text()='5 Points']";
//    //Kích Assign to và chọn Michael Wood
//    public static String click_Assign = "//label[text()='Assign to']/following::div[@id='s2id_assigned_to']";
//    public static String select_Assign = "//div[text()='Michael Wood']";
//    public static String click_Collaborators = "//label[text()='Collaborators']/following::div[@id='s2id_collaborators']";
//    public static String select_Collaborators = "//div[text()='Sara Ann']";
//    public static String click_Status = "//label[text()='Status']/following::div[@id='s2id_task_status_id']";
//    public static String select_Status = "//div[text()='To do']";
//    public static String click_Priority = "//label[text()='Priority']/following::div[@id='s2id_priority_id']";
//    public static String select_Priority = "//div[text()='Major']";
//    public static String click_Labels = "//label[text()='Labels']/following::div[@id='s2id_project_labels']";
//    public static String select_Labels = "//div[text()='Bug']";
//    public static String start_date = "//input[@name='start_date']";
//    public static String deadline = "//input[@name='deadline']";
//    public static String Recurring = "(//input[@type='checkbox'])[3]";
//    public static String Save = "//button[text()=' Save']";

//}
