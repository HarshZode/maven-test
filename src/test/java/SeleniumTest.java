import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
public class SeleniumTest {

    public static WebDriver driver = new FirefoxDriver();

    @BeforeTest
    void setup() {
        System.setProperty("webdriver.gecko.driver", "asset/geckodriver.exe");

        // driver.get("http://127.0.0.1:5500/index.html");
        driver.get("http://65.2.74.157:80/");

    }

    @Test
    void firstTeststep(){
        driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("First Todo");
        driver.findElement(By.xpath("//*[@id=\"form\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"todos\"]/li")).click();
//        driver.close();
    }
    @Test
    void secondTeststep(){
        //Instantiate Action Class
        Actions actions = new Actions(driver);

        WebElement btnElement = driver.findElement(By.xpath("//*[@id=\"todos\"]/li"));
        actions.contextClick(btnElement).perform();
        driver.close();
    }
}
//    ####################################
//    #     Other Example
//    ####################################
//    driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
//    driver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();
//
//    driver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("sa");
//    driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("sa");
//
//    driver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();
//
//    WebElement webElement =     driver.findElement(By.xpath("//*[@id=\"ShoeType\"]"));
//
//    String actualFirstCategory = webElement.getText();
//
//    String expectedFirstCategory = "Formal Shoes";
//
//    Assert.assertEquals(expectedFirstCategory, actualFirstCategory);
