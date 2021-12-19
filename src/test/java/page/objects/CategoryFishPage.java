package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class CategoryFishPage {
    private Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//div[@id=\"QuickLinks\"]/a[1]/img")
    private WebElement fishCategory;

    public CategoryFishPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);

    }

    public AddAngelFishToCart clickOnFishCategory(){
        WaitForElement.waitUntilElementIsClickable(fishCategory);
        fishCategory.click();
        String angelFish = fishCategory.getText();
        logger.info("Fish category {} has been chosen", angelFish);
        return new AddAngelFishToCart();
    }
}
