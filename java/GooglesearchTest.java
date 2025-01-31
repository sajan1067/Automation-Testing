import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
public class GooglesearchTest {
    WebDriver driver;

    @BeforeClass
    public void SetUp(){
        //setting up the path of the chrome driver
        System.setProperty("webdriver.chrome.driver","src/test/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void SearchInGoogle(){
        //OPen Google
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Test Automation");
        searchBox.submit();
    }
    @AfterClass
    public void closeBrowser(){
        // To quite browser
        driver.quit();
    }

}
