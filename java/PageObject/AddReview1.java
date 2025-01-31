package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddReview1 {
    WebDriver driver;

    // Constructor to initialize the driver and PageFactory elements
    public AddReview1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    // Locators using @FindBy
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
    WebElement product;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/h2")
    WebElement verifyProduct;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[4]/div/div[2]/ul/li/a")
    WebElement view;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[3]/div[1]/ul/li/a")
    WebElement verifyReview;

    @FindBy(id = "name")
    WebElement NameField;

    @FindBy(id = "email")
    WebElement EmailField;

    @FindBy(id = "review")
    WebElement review;

    @FindBy(id = "button-review")
    WebElement submit;

    @FindBy(xpath = "//*[@id=\"review-section\"]/div/div")
    WebElement alert;

    public void ClickProduct(){
        product.click();
    }
    public void VerifyProduct(){
        Assert.assertTrue(verifyProduct.isDisplayed(),
                "All Products");
    }
    public void ClickViewProduct(){
        view.click();
    }
    public void VerifyReview(){
        Assert.assertTrue(verifyReview.isDisplayed(),
                "Write Your Review");
    }
    public void EnterNameField(String name){
        NameField.sendKeys(name);
    }
    public void EnterEmailField(String email){
        EmailField.sendKeys(email);
    }
    public void EnterReview(String name){
        review.sendKeys(name);
    }
    public void ClickSubmit(){
        submit.click();
    }
    public void VerifyAlert(){
        Assert.assertTrue(alert.isDisplayed(),
                "Thank you for your review");
    }

}
