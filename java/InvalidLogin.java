import PageObject.invalidLogin1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class InvalidLogin {
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
    public void logIn() {
        invalidLogin1 login = new invalidLogin1(driver);
        //verify that home page is visible
        login.DisplayHome();
        //click on signup/login button
        login.clickButton();
        //verify the login to your account is visible
        login.verifyLogin();
        //enter email and password
        login.EnterEmail("sajanchhetri@gmail.com");
        login.EnterPassword("sajan123");
        login.ClickOnLoginButton();
        login.assertErrorMessageDisplayed("Your email or password is incorrect!");

    }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(5000);//wait for 5 sec
        driver.close();
        driver.quit();
    }
}
