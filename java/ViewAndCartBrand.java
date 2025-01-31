import PageObject.ViewAndCartBrand1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ViewAndCartBrand {
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
    public void ViewAndCart(){
        ViewAndCartBrand1 ViewAndCart = new ViewAndCartBrand1(driver);
        //Click on 'Products' button
        ViewAndCart.ClickProduct();
        //Verify that Brands are visible on left side bar
        ViewAndCart.VerifyBrand();
        //Click on any brand name
        ViewAndCart.ClickBrandName();
        //Verify that user is navigated to brand page and brand products are displayed
        ViewAndCart.VerifyBrandName();
        //On left side bar, click on any other brand link
        ViewAndCart.ClickNextBrand();
        // Verify that user is navigated to that brand page and can see products
        ViewAndCart.VerifyBrand2();
    }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(5000);//wait for 5 sec
        driver.close();
        driver.quit();
    }
}
