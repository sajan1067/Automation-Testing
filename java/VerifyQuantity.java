import PageObject.VerifyQuantity1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
public class VerifyQuantity {
    WebDriver driver;

    @BeforeClass
    public void SetUp() {
        //setting up the path of the chrome driver
        System.setProperty("webdriver.chrome.driver","src/test/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");
    }
    @Test
    public void Quantity(){
        VerifyQuantity1 Quantity = new VerifyQuantity1(driver);
        //Verify that home page is visible successfully
        Quantity.DispalyHome();
        //Click 'View Product' for any product on home page
        Quantity.ClickViewProduct();
        // Verify product detail is opened
        Quantity.VerifyDetails();
        // Increase quantity to 4
        Quantity.IncreasedQuantity("4");
        //Click 'Add to cart' button
        Quantity.ClickAddToCart();
        //Quantity.ClickContinue();
        Quantity.clickContinueShopping();
        // Click 'View Cart' button
        Quantity.ClickCart();
        // Verify that product is displayed in cart page with exact quantity
        Quantity.VerifyQuantity();

    }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(5000);//wait for 5 sec
        driver.close();
        driver.quit();
    }
}
