import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

    @FindBy(css = "#Content a")
    private WebElement enterStoreLink;

    private WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnEnterStoreLink(){
        enterStoreLink.click();
    }
}
