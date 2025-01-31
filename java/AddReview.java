import PageObject.AddReview1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddReview {
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
    public void ReviewAdd(){
        AddReview1 Review = new AddReview1(driver);
        // Click on 'Products' button
        Review.ClickProduct();
        // Verify user is navigated to ALL PRODUCTS page successfully
        Review.VerifyProduct();
        // Click on 'View Product' button
        Review.ClickViewProduct();
        //Verify 'Write Your Review' is visible
        Review.VerifyReview();
        //Enter name, email and review
        Review.EnterNameField("sajan g.c");
        Review.EnterEmailField("sajangc@gmail.com");
        Review.EnterReview("Good Product quality");
        // Click 'Submit' button
        Review.ClickSubmit();
        // Verify success message 'Thank you for your review.'
        Review.VerifyAlert();
    }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(5000);//wait for 5 sec
        driver.close();
        driver.quit();
    }
}
