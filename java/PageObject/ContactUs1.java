package PageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactUs1 {
    WebDriver driver ;

    public ContactUs1(WebDriver drivertest){
        this.driver = drivertest;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
    WebElement homePage;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a")
    WebElement clickContactus;

    @FindBy(xpath = "//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2")
    WebElement verify;

    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[1]/input")
    WebElement nameField;

    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[2]/input")
    WebElement emailField;

    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[3]/input")
    WebElement subject;

    @FindBy(id = "message")
    WebElement Message;

    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[5]/input")
    WebElement uploadFile;

    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[6]/input")
    WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]")
    WebElement successfulMessage;

    @FindBy(xpath = "//*[@id=\"form-section\"]/a/span")
    WebElement home;


    public void DispalyHome(){
        Assert.assertTrue(homePage.isDisplayed(),
                "Home");
    }
    public void ClickContactUsButton(){
        clickContactus.click();
    }
    public void VisibleGetInTouch(){
        Assert.assertTrue(verify.isDisplayed(),
                "GET IN TOUCH");
    }
    public void EnterName(String name){
        nameField.sendKeys(name);
    }
    public void EnterEmail(String email){
        emailField.sendKeys(email);
    }
    public void EnterSubject(String Subject){
        subject.sendKeys(Subject);
    }
    public void EnterMessage(String message){
        Message.sendKeys(message);
    }
    public void UploadFile(String filePath) {
        uploadFile.sendKeys(filePath);

    }
    public void SubmitButton(){
        submitButton.click();
    }
    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void VerifySuccessfulMessage(){
        Assert.assertTrue(successfulMessage.isDisplayed(),
                "Success! Your details have been submitted successfully.");
    }
    public void ClickHomeButton(){
        home.click();
    }
}
