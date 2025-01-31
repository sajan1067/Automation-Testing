package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class RecommendedItem1 {
    WebDriver driver;

    // Constructor to initialize the driver and PageFactory elements
    public RecommendedItem1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators using @FindBy
    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[2]/h2")
    WebElement verifyItem;

    @FindBy(xpath = "//*[@id=\"recommended-item-carousel\"]/div/div[2]/div[1]/div/div/div/a")
    WebElement AddCart;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[1]")
    WebElement popupMessage;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
    WebElement continueShoppingButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
    WebElement cartIcon;

    @FindBy(xpath = "//*[@id=\"product-4\"]/td[2]/h4/a")
    WebElement verifyItem1;

    public void VerifyRecommendedItem() {
        Assert.assertTrue(verifyItem.isDisplayed(),
                "recommended items");
    }
    public void ClickAddCart(){
        AddCart.click();
    }
    public void waitForPopupToAppear() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(popupMessage));
    }
    public void clickContinueShopping() {
        waitForPopupToAppear(); // Wait for the popup to appear
        continueShoppingButton.click(); // Click the "Continue Shopping" button
    }
    public void ClickCartIcon(){
        cartIcon.click();
    }
    public void VerifyProduct() {
        Assert.assertTrue(verifyItem1.isDisplayed(),
                "Stylish Dress");
    }

}
