import PageObject.PlaceOrderLogin1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PlaceOrderLogin {
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
    public void PlaceOrderLoginBeforeCheckout() {
        PlaceOrderLogin1 OrderPlaceLogin = new PlaceOrderLogin1(driver);
        //Verify that home page is visible successfully
        OrderPlaceLogin.DispalyHome();
        // Click 'Signup / Login' button
        OrderPlaceLogin.ClickLogin();
        // Fill email, password and click 'Login' button
        OrderPlaceLogin.EnterEmailAddress("sajanchhetri123@gmail.com");
        OrderPlaceLogin.Enter_password("Sajan12345");
        OrderPlaceLogin.ClickLoginButton();
        //Verify 'Logged in as username' at top
        OrderPlaceLogin.VerifyLogin();
        // Add products to cart
        OrderPlaceLogin.ClickAddToCart();
        OrderPlaceLogin.clickContinueShopping();
        // Click 'Cart' button
        OrderPlaceLogin.ClickCart();
        // Verify that cart page is displayed
        OrderPlaceLogin.VerifyCart();
        // Click Proceed To Checkout
        OrderPlaceLogin.ClickCheckoutProcessed();
        // Verify Address Details and Review Your Order
        String expectedAddress = "YOUR DELIVERY ADDRESS\nMr. sajan GC\nbutwal\ngorakpur delhi 007\nIndia\n9811939675";
        Assert.assertEquals(OrderPlaceLogin.getDeliveryAddress(), expectedAddress);

        String expectedAddress1 = "YOUR BILLING ADDRESS\nMr. sajan GC\nbutwal\ngorakpur delhi 007\nIndia\n9811939675";
        Assert.assertEquals(OrderPlaceLogin.getBillingAddress(), expectedAddress1);

        OrderPlaceLogin.reviewOrder();
        // Enter description in comment text area and click 'Place Order'
        OrderPlaceLogin.ClickTextArea("Hello!!");
        OrderPlaceLogin.ClickPlaceOrder();
        //Enter payment details: Name on Card, Card Number, CVC, Expiration date
        OrderPlaceLogin.EnterNameField("Sajan GC");
        OrderPlaceLogin.EnterCardNumber("123456");
        OrderPlaceLogin.EnterCVC("98789");
        OrderPlaceLogin.EnterExpiration("05");
        OrderPlaceLogin.EnterYear("2025");
        //Click 'Pay and Confirm Order' button
        OrderPlaceLogin.ConfirmOrder();
        // Verify success message 'Your order has been placed successfully!'
        OrderPlaceLogin.VerifyOrderPlaced();
        //click logout button
        OrderPlaceLogin.ClickLogout();
    }
    @AfterClass
    public void teardown() throws InterruptedException
    {
        Thread.sleep(5000);//wait for 5 sec
        driver.close();
        driver.quit();
    }
}
