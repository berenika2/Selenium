package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CateoryFishIdPage {
    @FindBy(css = "tr:nth-child(2) a")
    private WebElement fishAngel;

    private WebDriver driver;
    public CateoryFishIdPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }

    public void clickOnAngelFish(){
        fishAngel.click();
    }
}
