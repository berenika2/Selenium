package tests;

import org.testng.annotations.Test;
import page.objects.CategoryFishPage;
import page.objects.LandingPage;

public class AddItemToBasketAndCheckoutTest extends TestBase {
    @Test
    public void AddFishToBasketAndCheckout(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        CategoryFishPage fishCategory = new CategoryFishPage(driver);
        fishCategory.clickOnFishCategory();

        

    }
}
