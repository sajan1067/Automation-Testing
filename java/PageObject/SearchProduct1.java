package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchProduct1 {
    WebDriver driver ;

    public SearchProduct1(WebDriver drivertest){
        this.driver = drivertest;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
    WebElement homePage;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
    WebElement ProductButton;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/h2")
    WebElement navigateProduct;

    @FindBy(xpath = "//*[@id=\"search_product\"]")
    WebElement ProductName;

    @FindBy(id = "submit_search")
    WebElement SearchIcon;

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/h2")
    WebElement VerifyProduct;

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
    public void EnterProductName(String name){
        ProductName.sendKeys(name);
    }
    public void ClickSearchButton(){
        SearchIcon.click();
    }
    public void VerifySearchProduct(){
        Assert.assertTrue(VerifyProduct.isDisplayed(),
                "SEARCHED PRODUCTS");
    }
}
