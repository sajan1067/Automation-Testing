import PageObject.PlaceOrder1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PlaceOrder {
    WebDriver driver;

    @BeforeClass
    public void SetUp() {
        //setting up the path of the chrome driver
        System.setProperty("webdriver.chrome.driver", "src/test/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");
    }

    @Test
    public void Order() {
        PlaceOrder1 OrderPlace = new PlaceOrder1(driver);
        // Verify that home page is visible successfully
        OrderPlace.DispalyHome();
        // Add products to cart
        OrderPlace.ClickAddToCart();
        //click continue popup
        OrderPlace.clickContinueShopping();
        // Click 'Cart' button
        OrderPlace.ClickCart();
        // Verify that cart page is displayed
        OrderPlace.VerifyCart();
        // Click Proceed To Checkout
        OrderPlace.ClickCheckout();
        // Click 'Register / Login' button
        OrderPlace.ClickLoginRegister();
        // Fill all details in Signup and create account
        OrderPlace.EnterName("sajan");
        OrderPlace.EnterEmail("sajannn@gmail.com");
        OrderPlace.ClickSignup();
        OrderPlace.verifypage2();
        OrderPlace.SelectGender();
        OrderPlace.EnterPassword("Sajan123");
        OrderPlace.selectDateOfBirth("18", "August", "2002");
        OrderPlace.SelectInformation();
        OrderPlace.EnterFirstName("Sajan");
        OrderPlace.EnterLastname("Chhetri");
        OrderPlace.EnterCompanyName("Tech Axis");
        OrderPlace.EnterAddress("Lalitpur, Nepal");
        OrderPlace.selectCountry("Canada");
        OrderPlace.EnterState("ontario");
        OrderPlace.EnterCity("Toronto");
        OrderPlace.EnterZipcode("M4B 1B6");
        OrderPlace.EnterMobileNumber("+1 (647) 555-5678");
        OrderPlace.ClickButton();
        OrderPlace.verifyPage3();
        //Verify 'ACCOUNT CREATED!' and click 'Continue' button
        OrderPlace.ClickContinue();
        //Verify ' Logged in as username' at top
        OrderPlace.verifyPage4();
        //Click 'Cart' button
        OrderPlace.ClickCartIcon();
        //Click 'Proceed To Checkout' button
        OrderPlace.ClickProcessedCheckout();
        // Verify Address Details and Review Your Order

        String expectedAddress = "YOUR DELIVERY ADDRESS\nMr. Sajan Chhetri\nTech Axis\nLalitpur, Nepal\nToronto ontario M4B 1B6\nCanada\n+1 (647) 555-5678";
        Assert.assertEquals(OrderPlace.getDeliveryAddress(), expectedAddress);

        String expectedAddress1 = "YOUR BILLING ADDRESS\nMr. Sajan Chhetri\nTech Axis\nLalitpur, Nepal\nToronto ontario M4B 1B6\nCanada\n+1 (647) 555-5678";
        Assert.assertEquals(OrderPlace.getBillingAddress(), expectedAddress1);

        OrderPlace.reviewOrder();
        //Enter description in comment text area and click 'Place Order'
        OrderPlace.ClickTextArea("Hello!!");
        OrderPlace.ClickPlaceOrder();
        //Enter payment details: Name on Card, Card Number, CVC, Expiration date
        OrderPlace.EnterNameField("Sajan GC");
        OrderPlace.EnterCardNumber("123456");
        OrderPlace.EnterCVC("98789");
        OrderPlace.EnterExpiration("05");
        OrderPlace.EnterYear("2025");
        //Click 'Pay and Confirm Order' button
        OrderPlace.ConfirmOrder();
        // Verify success message 'Your order has been placed successfully!'
        OrderPlace.VerifyOrderPlaced();
        //Click 'Delete Account' button
        OrderPlace.ClickDelete();
        // Verify 'ACCOUNT DELETED!' and click 'Continue' button
        OrderPlace.VerifyDelete();
        OrderPlace.clickContinue();
    }
        @AfterClass
        public void teardown() throws InterruptedException
        {
            Thread.sleep(5000);//wait for 5 sec
            driver.close();
            driver.quit();
        }





}