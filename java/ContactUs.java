import PageObject.ContactUs1;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import  org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
public class ContactUs {
    WebDriver driver;

    @BeforeClass
    public void SetUp() {
        //setting up the path of the chrome driver
        System.setProperty("webdriver.chrome.driver", "src/test/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");
    }
     @Test
     public void contact()
     {
         ContactUs1 contactUs = new ContactUs1(driver);
         //verify the home page is visible
         contactUs.DispalyHome();
         //click on contact us button
         contactUs.ClickContactUsButton();
         //verify the get in touch is visible
         contactUs.VisibleGetInTouch();
         //enter name, email, subject abd message
         contactUs.EnterName("sajan gc");
         contactUs.EnterEmail("sajan123@gmail.com");
         contactUs.EnterSubject("Hello");
         contactUs.EnterMessage("hello");
         //upload a file
         contactUs.UploadFile("C:\\Users\\Acer\\Pictures\\Screenshots\\Screenshot 2024-12-24 185107.png");
         //click on submit button
         contactUs.SubmitButton();
         //click on ok button
         contactUs.acceptAlert();
         // Verify success message 'Success! Your details have been submitted successfully.' is visible
         contactUs.VerifySuccessfulMessage();
         //click on home button and landed on home page sucessfully
         contactUs.ClickHomeButton();
         String pageTitle = driver.getTitle();
         Assert.assertEquals("Automation Exercise", pageTitle);
     }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(10000);//wait for 10 sec
        driver.close();
        driver.quit();
    }

}
