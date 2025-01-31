import PageObject.RemoveProduct1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RemoveProduct {
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
    public void ProductRemove(){
        RemoveProduct1 ProductRemove = new RemoveProduct1(driver);
       // Verify that home page is visible successfully
        ProductRemove.DispalyHome();
        // Add products to cart
        ProductRemove.ClickAddToCart();
        ProductRemove.clickContinueShopping();
        //Click 'Cart' button
        ProductRemove.ClickCart();
        //Verify that cart page is displayed
        ProductRemove.VerifyCart();
        // Click 'X' button corresponding to particular product
        ProductRemove.ClickRemoveIcon();
    }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(5000);//wait for 5 sec
        driver.close();
        driver.quit();
    }

}
