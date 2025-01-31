package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AddProduct1 {

    WebDriver driver;

    // Constructor to initialize the driver and PageFactory elements
    public AddProduct1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators using @FindBy
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
    WebElement homePageElement;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
    WebElement productButton;

    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a")
    WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[1]")
    WebElement popupMessage;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
    WebElement continueShoppingButton;

    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[1]/a")
    WebElement secondAddToCartButton;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
    WebElement popupMessage2;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
    WebElement  continueShoppingButton2;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
    WebElement cartButton;

    @FindBy(xpath = "//*[@id=\"product-1\"]")
    WebElement cartItem1;

    @FindBy(xpath = "//*[@id=\"product-2\"]")
    WebElement cartItem2;

    // Methods to interact with elements
    public void displayHome() {
        Assert.assertTrue(homePageElement.isDisplayed(),
                "Home");
    }

    public void clickOnProductButton() {
        productButton.click();
    }

    public void clickAddToCart() {
        waitForElementToBeClickable(addToCartButton).click();
    }
    public void waitForPopupToAppear() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(popupMessage));
    }
    public void clickContinueShopping() {
        waitForPopupToAppear(); // Wait for the popup to appear
        continueShoppingButton.click(); // Click the "Continue Shopping" button
    }

    public void clickSecondAddToCart() {
        waitForElementToBeClickable(secondAddToCartButton).click();
    }
    public void waitForPopupToAppear1() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(popupMessage2));
    }
    public void clickContinueShopping2() {
        waitForPopupToAppear1(); // Wait for the popup to appear
        continueShoppingButton2.click(); // Click the "Continue Shopping" button
    }


    public void clickCartButton() {
        cartButton.click();
    }

    public void verifyCart() {
        Assert.assertTrue(cartItem1.isDisplayed() && cartItem2.isDisplayed(), "Products are not added to the cart");
    }

    // Helper method to wait for an element to be clickable
    private WebElement waitForElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
