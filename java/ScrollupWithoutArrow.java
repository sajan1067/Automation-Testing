import PageObject.ScrollupWithoutArrow1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScrollupWithoutArrow {
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
    public void withoutArrow(){
        //change
        ScrollupWithoutArrow1 WithoutArrow = new ScrollupWithoutArrow1(driver);
        // Verify that home page is visible successfully
        WithoutArrow.DispalyHome();
        // Scroll down page to bottom
        WithoutArrow.scrollToFooter();
        // Verify 'SUBSCRIPTION' is visible
        WithoutArrow.VerifySubscription();
        // Scroll up page to top
        WithoutArrow.scrollToHeader();
        // Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
        WithoutArrow.VerifyText1();
    }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(5000);//wait for 5 sec
        driver.close();
        driver.quit();
    }
}
