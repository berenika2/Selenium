package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class CateoryFishIdPage {
    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "tr:nth-child(2) a")
    private WebElement fishAngel;

    public CateoryFishIdPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public AddAngelFishToCart clickOnAngelFish(){
        WaitForElement.waitUntilElementIsClickable(fishAngel);
        fishAngel.click();
        String angelFish = fishAngel.getText();
        logger.info("{} has been clicked", angelFish);
        return new AddAngelFishToCart();
    }
}
