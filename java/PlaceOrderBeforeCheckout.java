import PageObject.PlaceOrderBeforeCheckOut1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PlaceOrderBeforeCheckout {
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
    public void OrderBeforeCheckout(){
        PlaceOrderBeforeCheckOut1 OrderCheckOut = new PlaceOrderBeforeCheckOut1(driver);
        //Verify that home page is visible successfully
        OrderCheckOut.DispalyHome();
        // Click 'Signup / Login' button
        OrderCheckOut.signupLoginClick();
        // Fill all details in Signup and create account
        OrderCheckOut.verifyPage();
        OrderCheckOut.EnterName("sajan");
        OrderCheckOut.EnterEmail("sajannn@gmail.com");
        OrderCheckOut.ClickSignup();
        OrderCheckOut.verifypage2();
        OrderCheckOut.SelectGender();
        OrderCheckOut.EnterPassword("Sajan123");
        OrderCheckOut.selectDateOfBirth("18", "August", "2002");
        OrderCheckOut.SelectInformation();
        OrderCheckOut.EnterFirstName("Sajan");
        OrderCheckOut.EnterLastname("Chhetri");
        OrderCheckOut.EnterCompanyName("Tech Axis");
        OrderCheckOut.EnterAddress("Lalitpur, Nepal");
        OrderCheckOut.selectCountry("Canada");
        OrderCheckOut.EnterState("ontario");
        OrderCheckOut.EnterCity("Toronto");
        OrderCheckOut.EnterZipcode("M4B 1B6");
        OrderCheckOut.EnterMobileNumber("+1 (647) 555-5678");
        OrderCheckOut.ClickButton();
        OrderCheckOut.verifyPage3();
        //click on continue button
        OrderCheckOut.ClickContinue();
        //Verify that 'Logged in as username' is visible
        OrderCheckOut.verifyPage4();
        // Add products to cart
        OrderCheckOut.ClickAddToCart();
        OrderCheckOut.clickContinueShopping();
        // Click 'Cart' button
        OrderCheckOut.ClickCart();
        // Verify that cart page is displayed
        OrderCheckOut.VerifyCart();
        // Click Proceed To Checkout
        OrderCheckOut.ClickCheckoutProcessed();
        //Verify Address Details and Review Your Order
        String expectedAddress = "YOUR DELIVERY ADDRESS\nMr. Sajan Chhetri\nTech Axis\nLalitpur, Nepal\nToronto ontario M4B 1B6\nCanada\n+1 (647) 555-5678";
        Assert.assertEquals(OrderCheckOut.getDeliveryAddress(), expectedAddress);

        String expectedAddress1 = "YOUR BILLING ADDRESS\nMr. Sajan Chhetri\nTech Axis\nLalitpur, Nepal\nToronto ontario M4B 1B6\nCanada\n+1 (647) 555-5678";
        Assert.assertEquals(OrderCheckOut.getBillingAddress(), expectedAddress1);

        OrderCheckOut.reviewOrder();
        //Enter description in comment text area and click 'Place Order'
        OrderCheckOut.ClickTextArea("Hello!!");
        OrderCheckOut.ClickPlaceOrder();
        //Enter payment details: Name on Card, Card Number, CVC, Expiration date
        OrderCheckOut.EnterNameField("Sajan GC");
        OrderCheckOut.EnterCardNumber("123456");
        OrderCheckOut.EnterCVC("98789");
        OrderCheckOut.EnterExpiration("05");
        OrderCheckOut.EnterYear("2025");
        //Click 'Pay and Confirm Order' button
        OrderCheckOut.ConfirmOrder();
        // Verify success message 'Your order has been placed successfully!'
        OrderCheckOut.VerifyOrderPlaced();
        //Click 'Delete Account' button
        OrderCheckOut.ClickDelete();
        // Verify 'ACCOUNT DELETED!' and click 'Continue' button
        OrderCheckOut.VerifyDelete();
        OrderCheckOut.clickContinue();
    }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(5000);//wait for 5 sec
        driver.close();
        driver.quit();
    }
}
