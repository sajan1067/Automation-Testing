package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ViewAndCartBrand1 {
    WebDriver driver;

    // Constructor to initialize the driver and PageFactory elements
    public ViewAndCartBrand1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    // Locators using @FindBy
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
    WebElement product;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[1]/div/div[3]/h2")
    WebElement BrandVerify;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[1]/div/div[3]/div/ul/li[2]/a")
    WebElement BrandName;

    @FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div/h2")
    WebElement VerifyBrand;

    @FindBy(xpath = "/html/body/section/div/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/a")
    WebElement NextBrand;

    @FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div/h2")
    WebElement VerifyBrand2;

    public void ClickProduct(){
        product.click();
    }
    public void VerifyBrand(){
        Assert.assertTrue(BrandVerify.isDisplayed(),
                "Brands");
    }
    public void ClickBrandName(){
        BrandName.click();
    }
    public void VerifyBrandName(){
        Assert.assertTrue(VerifyBrand.isDisplayed(),
                "Brand - H&M Products");
    }
    public void ClickNextBrand(){
        NextBrand.click();
    }
    public void VerifyBrand2(){
        Assert.assertTrue(VerifyBrand2.isDisplayed(),
                "Brand - Polo Products");
    }

}
