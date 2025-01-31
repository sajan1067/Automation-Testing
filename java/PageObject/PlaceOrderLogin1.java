package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class PlaceOrderLogin1 {
    WebDriver driver ;

    public PlaceOrderLogin1(WebDriver drivertest){
        this.driver = drivertest;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
    WebElement homePage;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    WebElement login;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")
    WebElement EmailField;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")
    WebElement PasswordField;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/button")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")
    WebElement VerifySajanLogin;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[3]/div/div[1]/div[1]/a")
    WebElement ProductAdd;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[1]")
    WebElement popupMessage;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
    WebElement continueShoppingButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
    WebElement CartIcon;

    @FindBy(xpath = "//*[@id=\"cart_items\"]/div/div[1]/ol/li[2]")
    WebElement getVerifyButton;

    @FindBy(xpath = "//*[@id=\"do_action\"]/div[1]/div/div/a")
    WebElement checkoutProcessed;

    @FindBy(xpath = "//*[@id=\"address_delivery\"]")
    WebElement deliveryAddress;

    @FindBy(xpath = "//*[@id=\"address_invoice\"]")
    WebElement billingAddress;

    @FindBy(xpath = "//*[@id=\"ordermsg\"]/textarea")
    WebElement TextArea;

    @FindBy(xpath = "//*[@id=\"cart_items\"]/div/div[7]/a")
    WebElement placeOrder;

    @FindBy(xpath = "//*[@id=\"payment-form\"]/div[1]/div/input")
    WebElement NameField;

    @FindBy(xpath = "//*[@id=\"payment-form\"]/div[2]/div/input")
    WebElement CardNumber;

    @FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[1]/input")
    WebElement CVC;

    @FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[2]/input")
    WebElement Expiration;

    @FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[3]/input")
    WebElement year;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    WebElement orderConfirm;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/p")
    WebElement VerifyPay;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    WebElement logOut;

    public void DispalyHome(){
        Assert.assertTrue(homePage.isDisplayed(),
                "Home");
    }
    public void ClickLogin(){
        login.click();
    }
    public void EnterEmailAddress(String email){
        EmailField.sendKeys(email);
    }
    public void Enter_password(String password){
        PasswordField.sendKeys(password);
    }
    public void ClickLoginButton(){
        loginButton.click();
    }
    public void VerifyLogin(){
        Assert.assertTrue(VerifySajanLogin.isDisplayed(),
                " Logged in as sajan");
    }
    public void ClickAddToCart(){
        ProductAdd.click();
    }
    public void waitForPopupToAppear() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(popupMessage));
    }
    public void clickContinueShopping() {
        waitForPopupToAppear(); // Wait for the popup to appear
        continueShoppingButton.click();
    }
    public void ClickCart(){
        CartIcon.click();
    }
    public void VerifyCart(){
        Assert.assertTrue(getVerifyButton.isDisplayed(),
                "Shopping Cart");
    }
    public void ClickCheckoutProcessed() {
        checkoutProcessed.click();
    }public String getDeliveryAddress() {
        return deliveryAddress.getText();
    }
    public String getBillingAddress() {
        return billingAddress.getText();
    }
    public void reviewOrder() {
        // Add logic to review the order
    }
    public void ClickTextArea(String Text){
        TextArea.sendKeys(Text);
    }
    public void ClickPlaceOrder(){
        placeOrder.click();
    }
    public void EnterNameField(String name){
        NameField.sendKeys(name);
    }
    public void EnterCardNumber(String number){
        CardNumber.sendKeys(number);
    }
    public void EnterCVC(String number){
        CVC.sendKeys(number);
    }
    public void EnterExpiration(String number){
        Expiration.sendKeys(number);
    }
    public void EnterYear(String number){
        year.sendKeys(number);
    }
    public void ConfirmOrder(){
        orderConfirm.click();
    }
    public void VerifyOrderPlaced(){
        Assert.assertTrue(VerifyPay.isDisplayed(),
                "Congratulations! Your order has been confirmed!");
    }
    public void ClickLogout(){
        logOut.click();
    }
}
