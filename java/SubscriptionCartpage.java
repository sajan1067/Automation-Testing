import PageObject.SubscriptionCartPage1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
public class SubscriptionCartpage {
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
    public void cartPage() {
        SubscriptionCartPage1 VerifySubscription = new SubscriptionCartPage1(driver);
        //Verify that home page is visible successfully
        VerifySubscription.DispalyHome();
        //Click 'Cart' button
        VerifySubscription.ClickCartButton();
        //Scroll down to footer
        VerifySubscription.scrollToFooter();
        //Verify text 'SUBSCRIPTION'
        VerifySubscription.VerifySubscription();
        //Enter email address in input and click arrow button
        VerifySubscription.EnterEmailField("sajanchhetri@gmail.com");
        VerifySubscription.ClickArrow();
        //Verify success message 'You have been successfully subscribed!' is visible
        VerifySubscription.SuccessfulMessage();
    }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(5000);//wait for 5 sec
        driver.close();
        driver.quit();
    }
}
