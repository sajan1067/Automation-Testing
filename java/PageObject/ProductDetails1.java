package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductDetails1 {
    WebDriver driver ;

    public ProductDetails1(WebDriver drivertest){
        this.driver = drivertest;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
    WebElement homePage;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
    WebElement ProductButton;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/h2")
    WebElement navigateProduct;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")
    WebElement ViewProduct;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2")
    WebElement productName;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]")
    WebElement productCategory;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span")
    WebElement productPrice;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]")
    WebElement productAvailability;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]")
    WebElement productCondition;

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]")
    WebElement productBrand;


    public void DispalyHome(){
        Assert.assertTrue(homePage.isDisplayed(),
                "Home");
    }
    public void ClickProductButton(){
        ProductButton.click();
    }
    public void NavigateAllProduct(){
        Assert.assertTrue(navigateProduct.isDisplayed(),
                "ALL PRODUCTS");
    }
    public void ClickViewProduct(){
        ViewProduct.click();
    }
    public void verifyProductDetails(String expectedName, String expectedCategory,
                                     int expectedPrice, String expectedAvailability,
                                     String expectedCondition, String expectedBrand) {
        Assert.assertEquals(productName.getText(), expectedName, "Blue Top");
        Assert.assertEquals(productCategory.getText(), expectedCategory, "Category: Women > Tops");
        Assert.assertEquals(Integer.parseInt(productPrice.getText().replaceAll("Rs. ", "")), expectedPrice, "500");
        Assert.assertEquals(productAvailability.getText(), expectedAvailability, "Availability: In Stock");
        Assert.assertEquals(productCondition.getText(), expectedCondition, "Condition: New");
        Assert.assertEquals(productBrand.getText(), expectedBrand, "Brand: Polo");

    }
}
