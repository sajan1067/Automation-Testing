import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.interactions.Actions;


public class ElementsTutorials {
    WebDriver driver;

    @BeforeClass
    public void SetUp() {
        //setting up the path of the chrome driver
        System.setProperty("webdriver.chrome.driver", "src/test/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void TextBox() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
        WebElement fullName = driver.findElement(By.id("fullname"));
        fullName.sendKeys("sajan");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("sajanchhetri@gmail.com");
        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("butwal-01,Rupandehi,Nepal");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("sajan123");
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"TextForm\"]/div[5]/input"));
        submit.click();
    }
     @Test
    public void checkBox() {
         driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
        WebElement main1 = driver.findElement(By.xpath("//*[@id=\"c_bs_1\"]"));
        main1.click();
        WebElement main2 = driver.findElement(By.xpath("//*[@id=\"c_bs_2\"]"));
        main2.click();
    }

    @Test
    public void radioButton() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
        WebElement radio = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[3]/input"));
        radio.click();
    }

    @Test
    public void webTables() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        WebElement addButton = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/span[1]/button"));
        addButton.click();
        WebElement name = driver.findElement(By.id("firstname"));
        name.sendKeys("Sajan");
        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.sendKeys("chhetri");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("sajanchetri@gmail.com");
        WebElement age = driver.findElement(By.id("age"));
        age.sendKeys("2222");
        WebElement salary = driver.findElement(By.id("salary"));
        salary.sendKeys("150000000000000000000000000");
        WebElement department = driver.findElement(By.id("deparment"));
        department.sendKeys("IT");
        WebElement login = driver.findElement(By.xpath("//*[@id=\"RegisterForm\"]/div[2]/input"));
        login.click();
        WebElement deleteButton = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[7]/a[2]"));
        deleteButton.click();
        WebElement textField = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[1]/td[7]/a[1]"));
        textField.click();
    }
    @Test
    public void buttonsBox() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
        WebElement click = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[1]"));
        click.click();
        WebElement doubleClick = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[3]"));
        doubleClick.click();
    }
    @Test
    public void uploadDownload() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
        WebElement download = driver.findElement(By.xpath("//*[@id=\"downloadButton\"]"));
        download.click();
        WebElement uploadElement = driver.findElement(By.id("uploadFile"));
        uploadElement.sendKeys("C:\\Users\\Acer\\Pictures\\Screenshots\\Screenshot (7).png");
    }
    /*@AfterClass
    public void closeBrowser(){
        // To quite browser
        driver.quit();
    }
*/
}
