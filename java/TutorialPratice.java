import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.interactions.Actions;

public class TutorialPratice {
    WebDriver driver;

    @BeforeClass
    public void SetUp() {
        //setting up the path of the chrome driver
        System.setProperty("webdriver.chrome.driver", "src/test/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
    }
    @Test
    public void PracticeForm(){
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Sajan G.C");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("sajanchhetri@gmail.com");

        WebElement gender = driver.findElement(By.xpath("//*[@id=\"gender\"]"));
        gender.click();

        WebElement mobile = driver.findElement(By.id("mobile"));
        mobile.sendKeys("9876543210");

        WebElement dateInput = driver.findElement(By.id("dob"));
        dateInput.sendKeys("03-01-2001");

        WebElement subjects = driver.findElement(By.id("subjects"));
        subjects.sendKeys("maths");

       WebElement hobbies = driver.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[7]/div/div/div[3]/input"));
       hobbies.click();
       WebElement hobbie = driver.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[7]/div/div/div[2]/input"));
       hobbie.click();

       Actions actions = new Actions(driver);
       actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();

       driver.findElement(By.xpath("//textarea[@placeholder='Currend Address']")).sendKeys("Butwal,Rupandehi");

        WebElement stateDropdown = driver.findElement(By.id("state"));
        Select stateSelect = new Select(stateDropdown);
        stateSelect.selectByVisibleText("Haryana");
        WebElement cityDropdown = driver.findElement(By.id("city"));
        Select citySelect = new Select(cityDropdown);
        citySelect.selectByVisibleText("Agra");

    }
    @AfterClass
    public void closeBrowser(){
        // To quite browser
        driver.quit();
    }
}
