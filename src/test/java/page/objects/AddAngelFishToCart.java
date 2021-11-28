package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAngelFishToCart {
    @FindBy(css = "a.Button[href$='EST-2']")
    private WebElement addSmallAngelfishtoCart;

    private WebDriver driver;
    public AddAngelFishToCart(WebDriver driver){
        PageFactory.initElements(driver, this);

    }

    public void clickOnAddToCart(){
        addSmallAngelfishtoCart.click();
    }
}
