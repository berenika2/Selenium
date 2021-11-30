package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
    @FindBy(css = "a.Button[href*='Order']")
    WebElement proceedToCheckout;

    public ShoppingCart(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);

    }

    public void setProceedToCheckout(){
        proceedToCheckout.click();
    }
}
