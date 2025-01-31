package PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VerifySubscriptionHomepage1 {
    WebDriver driver ;

    public VerifySubscriptionHomepage1(WebDriver drivertest){
        this.driver = drivertest;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
    WebElement homePage;

    @FindBy(xpath = "//*[@id=\"footer\"]/div[2]")
    WebElement footer;

    @FindBy(xpath = "//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")
    WebElement verifySubscription;

    @FindBy(xpath = "//*[@id=\"susbscribe_email\"]")
    WebElement EmailField;

    @FindBy(id = "subscribe")
    WebElement clickArrow;

    @FindBy(id = "success-subscribe")
    WebElement successfulMessage;

    public void DispalyHome(){
        Assert.assertTrue(homePage.isDisplayed(),
                "Home");
    }
    public void scrollToFooter() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", footer);
    }
    public void VerifySubscription(){
        Assert.assertTrue(verifySubscription.isDisplayed(),
                "SUBSCRIPTION");
    }
    public void EnterEmailField(String name){
        EmailField.sendKeys(name);
    }
    public void ClickArrow(){
        clickArrow.click();
    }
    public void SuccessfulMessage(){
        Assert.assertTrue(successfulMessage.isDisplayed(),
                "You have been successfully subscribed!");
    }
}
