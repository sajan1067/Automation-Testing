import PageObject.ProductDetails1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
public class ProductDetails {
    WebDriver driver;
    @BeforeClass
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");
    }
    @Test
    public void product() {
        ProductDetails1 VerifyProduct = new ProductDetails1(driver);
        //Verify that home page is visible successfully
        VerifyProduct.DispalyHome();
        //Click on 'Products' button
        VerifyProduct.ClickProductButton();
        //Verify user is navigated to ALL PRODUCTS page successfully
        VerifyProduct.NavigateAllProduct();
        //Click on 'View Product' of first product
        VerifyProduct.ClickViewProduct();
        //Verify that detail is visible: product name, category, price, availability, condition, brand
        VerifyProduct.verifyProductDetails(
                "Blue Top",
                "Category: Women > Tops",
                500,
                "Availability: In Stock",
                "Condition: New",
                "Brand: Polo"

        );

    }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(10000);//wait for 10 sec
        driver.close();
        driver.quit();
    }
}
