import PageObject.ExistingEmail1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class ExistingEmail {
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
    public void emailAlready(){
        ExistingEmail1 ExistEmail =new ExistingEmail1(driver);
        //Verify that home page is visible successfully
      ExistEmail.DisplayHome();
      //click on signup/login button
      ExistEmail.clickButton();
      // Verify 'New User Signup!' is visible
      ExistEmail.verifyPage();
      //enter the name and email already registered
      ExistEmail.EnterName("sajan");
      ExistEmail.EnterEmail("sajan123@gmail.com");
      //click on submit button
      ExistEmail.ClickSignup();
      //Verify error 'Email Address already exist!' is visible
      ExistEmail.ErrorMessage();
  }
  @AfterClass
    public void teardown() throws InterruptedException
  {
      Thread.sleep(10000);//wait for 10 sec
      driver.close();
      driver.quit();
  }
}
