package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ViewCategory1 {
    WebDriver driver ;

    public ViewCategory1(WebDriver drivertest){
        this.driver = drivertest;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/section[2]/div/div/div[1]/div/h2")
    WebElement verifyCategory;

    @FindBy(xpath = "//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")
    WebElement women;

    @FindBy(xpath = "//*[@id=\"Women\"]/div/ul/li[1]/a")
    WebElement Dress;

    @FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div/h2")
    WebElement verifyDress;

    @FindBy(xpath = "//*[@id=\"accordian\"]/div[2]/div[1]/h4/a")
    WebElement Men;

    @FindBy(xpath = "//*[@id=\"Men\"]/div/ul/li[1]/a")
    WebElement TShirt;

    @FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div/h2")
    WebElement verifyMenDress;

    public void VerifyCategory() {
        Assert.assertTrue(verifyCategory.isDisplayed(),
                "Category");
    }
    public void ClickWomen(){
        women.click();
    }
    public void ClickDress(){
        Dress.click();
    }
    public void VerifyDress() {
        Assert.assertTrue(verifyDress.isDisplayed(),
                "Women - Dress Products");
    }
    public void ClickMen(){
        Men.click();
    }
    public void ClickTShirt(){
        TShirt.click();
    }
    public void VerifyMenDress() {
        Assert.assertTrue(verifyMenDress.isDisplayed(),
                "Men - Tshirts Products");
    }

}
