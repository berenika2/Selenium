import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class FailedLoginTest {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("http://przyklady.javastart.pl/jpetstore/");
    }

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {
        WebElement enterStoreLink = driver.findElement(By.cssSelector("#Content a"));
        enterStoreLink.click();

        WebElement signOnLink = driver.findElement(By.cssSelector("#MenuContent a[href*='signonForm']"));
        signOnLink.click();

        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("NotExistingLogin");

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("NotProperPassword");

        WebElement signOnButton = driver.findElement(By.name("signon"));
        signOnButton.click();

        WebElement messageLabel = driver.findElement(By.cssSelector("#Content ul[class='messages'] li"));

        assertEquals(messageLabel.getText(), "Invalid username or password. Signon failed.");
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}