package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CateoryFishIdPage {
    @FindBy(css = "tr:nth-child(2) a")
    private WebElement fishAngel;

    public CateoryFishIdPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnAngelFish(){
        fishAngel.click();
    }
}
