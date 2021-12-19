package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class AddAngelFishToCart {
    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "a.Button[href$='EST-2']")
    private WebElement addSmallAngelfishtoCart;

    public AddAngelFishToCart(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);

    }

    public ShoppingCart clickOnAddToCart(){
        WaitForElement.waitUntilElementIsClickable(addSmallAngelfishtoCart);
        addSmallAngelfishtoCart.click();
        String angelFish = addSmallAngelfishtoCart.getText();
        logger.info("Added small angel fish to cart {}", angelFish);
        return new ShoppingCart();
    }
}
