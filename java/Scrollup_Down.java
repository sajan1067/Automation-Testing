import PageObject.Scrollup_Down1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Scrollup_Down {
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
    public void Scroll(){
        Scrollup_Down1 scrollUPDown = new Scrollup_Down1(driver);
        // Verify that home page is visible successfully
        scrollUPDown.DispalyHome();
        // Scroll down page to bottom
        scrollUPDown.scrollToFooter();
        // Verify 'SUBSCRIPTION' is visible
        scrollUPDown.VerifySubscription();
        //Click on arrow at bottom right side to move upward
        scrollUPDown.ScrollUpButton();
        // Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
        scrollUPDown.VerifyText();
    }
    public void teardown()throws InterruptedException
    {
        Thread.sleep(2000);//wait for 5 sec
        driver.close();
        driver.quit();
    }
}
