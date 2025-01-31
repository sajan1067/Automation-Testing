import PageObject.AddProduct1;
import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
public class AddProduct {
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
    public void ProductAdd(){
        AddProduct1 addProduct = new AddProduct1(driver);
       //Verify that home page is visible successfully
       addProduct.displayHome();
       //Click 'Products' button
       addProduct.clickOnProductButton();
       // Hover over first product and click 'Add to cart'
       addProduct.clickAddToCart();
       // Click continue
       addProduct.clickContinueShopping();
       // Hover over second product and click 'Add to cart'
       addProduct.clickSecondAddToCart();
       addProduct.clickContinueShopping2();
       // Click 'View Cart' button
       addProduct.clickCartButton();
       // Verify both products are added to Cart
       addProduct.verifyCart();

   }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(5000);//wait for 5 sec
        driver.close();
        driver.quit();
    }
}
