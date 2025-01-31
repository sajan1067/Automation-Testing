package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.time.Year;

public class PlaceOrder1 {
    WebDriver driver ;

    public PlaceOrder1(WebDriver drivertest){
        this.driver = drivertest;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
    WebElement homePage;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[26]/div/div[1]/div[1]/a")
    WebElement AddProduct;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[1]")
    WebElement popupMessage;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
    WebElement continueShoppingButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
    WebElement CartButton;

    @FindBy(xpath = "/html/body/section/div/div[1]/ol/li[2]")
    WebElement DisplayCart;

    @FindBy(xpath = "//*[@id=\"do_action\"]/div[1]/div/div/a")
    WebElement checkout;

    @FindBy(xpath = "//*[@id=\"checkoutModal\"]/div/div/div[2]/p[1]")
    WebElement popupMessage2;

    @FindBy(xpath = "//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u")
    WebElement Login_Register;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
    WebElement nameField;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
    WebElement emailField;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
    WebElement signupButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/h2/b")
    WebElement verifyPage;

    @FindBy(id = "id_gender1")
    WebElement male;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "days")
    WebElement dayDropdown;

    @FindBy(id = "months")
    WebElement monthDropdown;

    @FindBy(id = "years")
    WebElement yearDropdown;

    @FindBy(id = "optin")
    WebElement Information;

    @FindBy(id = "first_name")
    WebElement Firstname;

    @FindBy(id = "last_name")
    WebElement Lastname;

    @FindBy(id = "company")
    WebElement Company;

    @FindBy(id = "address1")
    WebElement Address;

    @FindBy(id = "country")
    WebElement country;

    @FindBy(id = "state")
    WebElement State;

    @FindBy(id = "city")
    WebElement City;

    @FindBy(id = "zipcode")
    WebElement Zipcode;

    @FindBy(id = "mobile_number")
    WebElement MobileNumber;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/form/button")
    WebElement createAccount;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/h2/b")
    WebElement accountCreated;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    WebElement clickContinue;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")
    WebElement verify;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
    WebElement cartIcon;

    @FindBy(xpath = "//*[@id=\"do_action\"]/div[1]/div/div/a")
    WebElement ProcessedCheckout;

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

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    WebElement delete;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/h2/b")
    WebElement verifyDelete;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    WebElement Continue;



    public void DispalyHome(){
        Assert.assertTrue(homePage.isDisplayed(),
                "Home");
    }
    public void ClickAddToCart(){
        AddProduct.click();
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
        CartButton.click();
    }
    public void VerifyCart(){
        Assert.assertTrue(DisplayCart.isDisplayed(),
                "Shopping Cart");
    }
    public void ClickCheckout(){
        checkout.click();
    }
    public void waitForPopupToAppear2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(popupMessage2));
    }
    public void ClickLoginRegister() {
        waitForPopupToAppear2(); // Wait for the popup to appear
        Login_Register.click(); // Click the  button
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
    public void verifypage2(){
        Assert.assertTrue(verifyPage.isDisplayed(),
                "Enter Account Information");
    }
    public void SelectGender(){
        male.click();
    }
    public void EnterPassword(String password){
        passwordField.sendKeys(password);
    }
    public void selectDateOfBirth(String day, String month, String year) {
        Select daySelect = new Select(dayDropdown);
        Select monthSelect = new Select(monthDropdown);
        Select yearSelect = new Select(yearDropdown);

        daySelect.selectByVisibleText(day);
        monthSelect.selectByVisibleText(month);
        yearSelect.selectByVisibleText(year);
    }
    public void SelectInformation(){
        Information.click();
    }
    public void EnterFirstName(String name){
        Firstname.sendKeys(name);
    }
    public void EnterLastname(String lname){
        Lastname.sendKeys(lname);
    }
    public void EnterCompanyName(String Cname){
        Company.sendKeys(Cname);
    }
    public void EnterAddress(String address){
        Address.sendKeys(address);
    }
    public void selectCountry(String Country) {
        Select countrySelect = new Select(country);
        countrySelect.selectByVisibleText(Country);
    }
    public void EnterState(String state){
        State.sendKeys(state);
    }
    public void EnterCity(String city){
        City.sendKeys(city);
    }
    public void EnterZipcode(String zipcode){
        Zipcode.sendKeys(zipcode);
    }
    public void EnterMobileNumber(String mobileNumber){
        MobileNumber.sendKeys(mobileNumber);
    }
    public void ClickButton(){
        createAccount.click();
    }
    public void verifyPage3() {
        Assert.assertTrue(accountCreated.isDisplayed(),
                "ACCOUNT CREATED!");
    }
    public void ClickContinue(){
        clickContinue.click();
    }
    public void verifyPage4() {
        Assert.assertTrue(verify.isDisplayed(),
                "Logged in as sajan");
    }
    public void ClickCartIcon(){
        cartIcon.click();
    }
    public void ClickProcessedCheckout(){
        ProcessedCheckout.click();
    }
    public String getDeliveryAddress() {
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
    public void ClickDelete(){
        delete.click();
    }
    public void VerifyDelete(){
        Assert.assertTrue(verifyDelete.isDisplayed(),
                "Account Deleted!");
    }
    public void clickContinue(){
        Continue.click();
    }
}
