import PageObject.SingUp1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class SignUp {
    WebDriver driver;

    @BeforeClass
    public void SetUp() {
        //setting up the path of the chrome driver
        System.setProperty("webdriver.chrome.driver","src/test/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");
    }
    @Test
    public void registerUser() {
        SingUp1 singup = new SingUp1(driver);
        //verify that home page is visible sucessfully
        singup.DispalyHome();
        singup.signupClick();
        //verify the new signup user is visible
        singup.verifyPage();
        //enter name and email address
        singup.EnterName("sajan");
        singup.EnterEmail("sajannn@gmail.com");
        //enter singup button
        singup.ClickSignup();
        //verify that enter account information is visible
        singup.verifypage2();
        //fill details
        singup.SelectGender();
        singup.EnterPassword("Sajan123");
        //Dropdown of date of birth
        singup.selectDateOfBirth("18", "August", "2002");

        singup.SelectInformation();
        singup.EnterFirstName("Sajan");
        singup.EnterLastname("Chhetri");
        singup.EnterCompanyName("Tech Axis");
        singup.EnterAddress("Lalitpur, Nepal");

        singup.selectCountry("Canada");
        singup.EnterState("ontario");
        singup.EnterCity("Toronto");
        singup.EnterZipcode("M4B 1B6");
        singup.EnterMobileNumber("+1 (647) 555-5678");

        // click on create account button
        singup.ClickButton();
        singup.verifyPage3();

         //click on continue button
        singup.ClickContinue();

        //Verify that 'Logged in as username' is visible
        singup.verifyPage4();

        //click on Delete Account
        singup.ClickDeleteAccount();
        singup.verifyPage5();
        singup.ClickContinue();
    }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(5000);//wait for 5 sec
        driver.close();
        driver.quit();
    }
}
