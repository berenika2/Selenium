package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryFishPage {

    @FindBy(xpath = "//div[@id=\"QuickLinks\"]/a[1]/img")
    private WebElement fishCategory;

    public CategoryFishPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);

    }

    public void clickOnFishCategory(){
        fishCategory.click();
    }
}
