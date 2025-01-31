package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

public class TestCasePage1 {
    WebDriver driver ;

    public TestCasePage1(WebDriver drivertest){
        this.driver = drivertest;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
    WebElement homePage;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    WebElement ClickTestcase;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div[1]/div/h2/b")
    WebElement VerifyPage;

    public void DispalyHome(){
        Assert.assertTrue(homePage.isDisplayed(),
                "Home");
    }
    public void ClickTestCase(){
        ClickTestcase.click();
    }
    public void VerifyTestCasePage(){
        Assert.assertTrue(VerifyPage.isDisplayed(),
                "TEST CASES");
    }

}
