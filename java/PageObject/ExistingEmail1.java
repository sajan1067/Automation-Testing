package PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ExistingEmail1 {
    WebDriver driver ;

    public ExistingEmail1(WebDriver drivertest){
        this.driver = drivertest;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
    WebElement homePage;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    WebElement clickButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/h2")
    WebElement verifyButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
    WebElement nameField;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
    WebElement emailField;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
    WebElement signupButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/p")
    WebElement errorMessage;

    public  void DisplayHome() {
        Assert.assertTrue(homePage.isDisplayed(),
                "Home");
    }
    public  void clickButton(){
        clickButton.click();
    }
    public void verifyPage(){
        Assert.assertTrue(verifyButton.isDisplayed(),
                "New User Signup!");
    }
    public void EnterName(String name){
        nameField.sendKeys(name);
    }
    public void EnterEmail(String email){
        emailField.sendKeys(email);
    }
    public void ClickSignup(){
        signupButton.click();
    }
    public void ErrorMessage(){
        Assert.assertTrue(errorMessage.isDisplayed(),
                "Email Address already exist!");
    }
}
