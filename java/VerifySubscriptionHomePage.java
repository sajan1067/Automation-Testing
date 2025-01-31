import PageObject.VerifySubscriptionHomepage1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class VerifySubscriptionHomePage {
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
    public void subscription() {
        VerifySubscriptionHomepage1 verifySubscriptionHome = new VerifySubscriptionHomepage1(driver);
        // Verify that home page is visible successfully
        verifySubscriptionHome.DispalyHome();
        //Scroll down to footer
        verifySubscriptionHome.scrollToFooter();
        //. Verify text 'SUBSCRIPTION
        verifySubscriptionHome.VerifySubscription();
        // Enter email address in input and click arrow button
        verifySubscriptionHome.EnterEmailField("sajanchhetri@gmail.com");
        verifySubscriptionHome.ClickArrow();
        //Verify success message 'You have been successfully subscribed!' is visible
        verifySubscriptionHome.SuccessfulMessage();
    }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(5000);//wait for 5 sec
        driver.close();
        driver.quit();
    }
}
