package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
    @FindBy(css = "a.Button[href*='Order']")
    WebElement proceedToCheckout;

    private WebDriver driver;
    public ShoppingCart(WebDriver driver){
        PageFactory.initElements(driver, this);

    }

    public void setProceedToCheckout(){
        proceedToCheckout.click();
    }
}
