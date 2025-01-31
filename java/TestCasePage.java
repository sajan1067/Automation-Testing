import PageObject.TestCasePage1;
import  org.openqa.selenium.By;
import  org.openqa.selenium.WebElement;
import  org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;
import  org.testng.Assert;
import  org.testng.annotations.Test;
import  org.testng.annotations.BeforeClass;
import  org.testng.annotations.AfterClass;

public class TestCasePage {
    WebDriver driver;
    @BeforeClass
            public void SetUp() {
    //setting of the path of web driver
    System.setProperty("webdriver.chrome.driver", "src/test/ChromeDriver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.automationexercise.com/");
    }
    @Test
    public void TestCase() {
        TestCasePage1 TestCase = new TestCasePage1(driver);
            //Verify that home page is visible successfully
            TestCase.DispalyHome();
            // Click on 'Test Cases' button
            TestCase.ClickTestCase();
            //Verify user is navigated to test cases page successfully
           TestCase.VerifyTestCasePage();
    }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(10000);//wait for 10 sec
        driver.close();
        driver.quit();
    }
}
