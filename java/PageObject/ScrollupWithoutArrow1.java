package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ScrollupWithoutArrow1 {
    WebDriver driver ;

    public ScrollupWithoutArrow1(WebDriver drivertest){
        this.driver = drivertest;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
    WebElement homePage;

    @FindBy(xpath = "//*[@id=\"footer\"]/div[2]")
    WebElement footer;

    @FindBy(xpath = "//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")
    WebElement verifySubscription;

    @FindBy(id = "header")
    WebElement header;

    @FindBy(xpath = "//*[@id=\"slider-carousel\"]/div/div[1]/div[1]/h2")
    WebElement verifyText1;

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
    public void scrollToHeader() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", header);
    }
    public void VerifyText1(){
        Assert.assertTrue(verifyText1.isDisplayed(),
                "Full-Fledged practice website for Automation Engineers");
    }


}
