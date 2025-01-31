import PageObject.SearchProduct1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.interactions.Actions;
public class SearchProduct {
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
    public void search()
    {
        SearchProduct1 searchProduct = new SearchProduct1(driver);
        // Verify that home page is visible successfully
        searchProduct.DispalyHome();
        // Click on 'Products' button
        searchProduct.ClickProductButton();
        //Verify user is navigated to ALL PRODUCTS page successfully
        searchProduct.NavigateAllProduct();
        //Enter product name in search input and click search button
        searchProduct.EnterProductName("shirt");
        searchProduct.ClickSearchButton();
        // Verify 'SEARCHED PRODUCTS' is visible
        searchProduct.VerifySearchProduct();

    }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(5000);//wait for 5 sec
        driver.close();
        driver.quit();
    }

}
