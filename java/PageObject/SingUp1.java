package PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

public class SingUp1 {
    WebDriver driver ;

    public SingUp1(WebDriver drivertest){
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

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    WebElement clickDeleteButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/h2/b")
    WebElement verify2;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    WebElement ClickContinue1;


    public void DispalyHome(){
        Assert.assertTrue(homePage.isDisplayed(),
                "Home");
    }
    public void signupClick(){
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
    public void ClickDeleteAccount(){
        clickDeleteButton.click();
    }
    public void verifyPage5() {
        Assert.assertTrue(verify2.isDisplayed(),
                "ACCOUNT DELETED!");
    }
    public void clickContinue(){
        ClickContinue1.click();
    }
}
