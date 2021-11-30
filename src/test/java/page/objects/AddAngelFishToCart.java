package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAngelFishToCart {
    @FindBy(css = "a.Button[href$='EST-2']")
    private WebElement addSmallAngelfishtoCart;

    public AddAngelFishToCart(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);

    }

    public void clickOnAddToCart(){
        addSmallAngelfishtoCart.click();
    }
}
