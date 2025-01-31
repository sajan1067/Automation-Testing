package PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LogoutUser1 {
    WebDriver driver ;

    public LogoutUser1(WebDriver drivertest){
        this.driver = drivertest;
        PageFactory.initElements(driver, this);
    }
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

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")
    WebElement verifyLogin;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    WebElement logoutButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    WebElement ContinueButton;

    public void DispalyHome(){
        Assert.assertTrue(homePage.isDisplayed(),
                "Home");
    }
    public void signupClick(){
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
    public void VerifyLogin(){
        Assert.assertTrue(verifyLogin.isDisplayed(),
                "Logged in as sajan");
    }
    public void ClickLogoutButton(){
        logoutButton.click();
    }
    public void ClickContinueButton(){
        ContinueButton.click();
    }



}
