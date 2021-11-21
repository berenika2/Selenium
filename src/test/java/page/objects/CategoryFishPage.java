package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryFishPage {

    @FindBy(xpath = "//div[@id=\"QuickLinks\"]/a[1]/img")
    WebElement fishCategory;

    private WebDriver driver;
    public CategoryFishPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }

    public void clickOnFishCategory(){
        fishCategory.click();
    }
}
