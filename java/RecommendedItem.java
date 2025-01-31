import PageObject.RecommendedItem1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RecommendedItem {
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
    public void AddCartFromRecommendedItem(){
        RecommendedItem1 CartFromRecommendedItem = new RecommendedItem1(driver);
        // Verify 'RECOMMENDED ITEMS' are visible
        CartFromRecommendedItem.VerifyRecommendedItem();
        // Click on 'Add To Cart' on Recommended product
        CartFromRecommendedItem.ClickAddCart();
        CartFromRecommendedItem.clickContinueShopping();
        //Click on 'View Cart' button
        CartFromRecommendedItem.ClickCartIcon();
        //Verify that product is displayed in cart page
        CartFromRecommendedItem.VerifyProduct();
    }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(5000);//wait for 5 sec
        driver.close();
        driver.quit();
    }
}
