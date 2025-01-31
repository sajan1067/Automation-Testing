package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


//using page factory
public class invalidLogin1 {
    WebDriver driver ;

    public invalidLogin1(WebDriver drivertest){
        this.driver = drivertest;
        PageFactory.initElements(driver, this);
    }
    //find the web element
    //identify user_name
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
    WebElement homePage;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    WebElement clickButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/h2")
    WebElement verifyButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")
    WebElement emailField;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/button")
    WebElement LoginButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/p")
    WebElement errorMessage;

    public  void DisplayHome() {
        Assert.assertTrue(homePage.isDisplayed(),
                "Home");
    }

    public  void clickButton(){
        clickButton.click();
    }

    public  void verifyLogin(){
        Assert.assertTrue(verifyButton.isDisplayed(),
                "Login to your account");
    }
    public void EnterEmail(String email){
        emailField.sendKeys(email);
    }

    public void EnterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void ClickOnLoginButton(){
        LoginButton.click();
    }

    public void assertErrorMessageDisplayed(String expectedMessage) {
        Assert.assertEquals(errorMessage.getText(), expectedMessage,
                "Your email or password is incorrect!");
}

    public invalidLogin1 verifyErrorMessage(String expectedMessage) {
        assertErrorMessageDisplayed(expectedMessage);
        return this;
    }
}
