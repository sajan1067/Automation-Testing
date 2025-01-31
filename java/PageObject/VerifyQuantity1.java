package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class VerifyQuantity1 {
    WebDriver driver ;

    public VerifyQuantity1(WebDriver drivertest){
        this.driver = drivertest;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
    WebElement homePage;

    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div[1]/div[3]/div/div[2]/ul/li/a")
    WebElement viewProduct;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2")
    WebElement verify;

    @FindBy(xpath = "//*[@id=\"quantity\"]")
    WebElement quantity;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")
    WebElement AddToCart;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
    WebElement ViewCart;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[1]")
    WebElement popupMessage;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
    WebElement continueShoppingButton;

    @FindBy(xpath = "//*[@id=\"product-2\"]/td[4]/button")
    WebElement verify1;

    public void DispalyHome(){
        Assert.assertTrue(homePage.isDisplayed(),
                "Home");
    }
    public void ClickViewProduct(){
        viewProduct.click();
    }
    public void VerifyDetails(){
        Assert.assertTrue(verify.isDisplayed(),
                "Men Tshirt");
    }
    public void IncreasedQuantity(String number){
        quantity.clear();
        quantity.sendKeys(number);
    }
    public void ClickAddToCart(){
        AddToCart.click();
    }
    public void waitForPopupToAppear() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(popupMessage));
    }
    public void clickContinueShopping() {
        waitForPopupToAppear(); // Wait for the popup to appear
        continueShoppingButton.click(); // Click the "Continue Shopping" button
    }
    public void ClickCart(){
        ViewCart.click();
    }
    public void VerifyQuantity(){
        Assert.assertTrue(verify1.isDisplayed(),
                "4");
    }
}
