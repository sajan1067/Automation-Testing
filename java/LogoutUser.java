import PageObject.LogoutUser1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
public class LogoutUser {
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
    public void homePage() {
        LogoutUser1 logout = new LogoutUser1(driver);
        //verify that home page is visible sucessfully
        logout.DispalyHome();
        // click on login/signup user
        logout.signupClick();
        //verify the login to your account is visible
        logout.verifyLogin();
        //enter correct email and password
        logout.EnterEmail("sajan123@gmail.com");
        logout.EnterPassword("sajan123");
        //click on login button
        logout.ClickOnLoginButton();
        //Verify that 'Logged in as username' is visible
        logout.VerifyLogin();
        //click on logout button
        logout.ClickLogoutButton();
        //click on continue button
        logout.ClickContinueButton();

    }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(5000);//wait for 5 sec
        driver.close();
        driver.quit();
    }
}
