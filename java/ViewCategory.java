import PageObject.ViewCategory1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.Callable;

public class ViewCategory {
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
    public void viewCategory(){
        ViewCategory1 CategoryView = new ViewCategory1(driver);
        // Verify that categories are visible on left side bar
        CategoryView.VerifyCategory();
        // Click on 'Women' category
        CategoryView.ClickWomen();
        //Click on any category link under 'Women' category, for example: Dress
        CategoryView.ClickDress();
        //Verify that category page is displayed and confirm text 'WOMEN - Dress PRODUCTS'
        CategoryView.VerifyDress();
        //In left side bar, click on any sub-category link of 'Men' category
        CategoryView.ClickMen();
        CategoryView.ClickTShirt();
        //Verify that user is navigated to that category page
        CategoryView.VerifyMenDress();
    }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(5000);//wait for 5 sec
        driver.close();
        driver.quit();
    }
}
