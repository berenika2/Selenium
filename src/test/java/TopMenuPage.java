import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuPage {

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    private WebElement signOnLink;

    private WebDriver driver;

    public TopMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnSignInLink(){
        signOnLink.click();
    }
}
