package tests;

import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.Test;
import page.objects.*;

import static org.testng.AssertJUnit.assertEquals;

public class AddItemToBasketAndCheckoutTest extends TestBase {
    @Test
    public void AddFishToBasketAndCheckout(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();
        sleep();
        CategoryFishPage fishCategory = new CategoryFishPage(driver);
        fishCategory.clickOnFishCategory();
        sleep();
        CateoryFishIdPage fishId = new CateoryFishIdPage(driver);
        fishId.clickOnAngelFish();
        sleep();
        AddAngelFishToCart angelFish = new AddAngelFishToCart(driver);
        angelFish.clickOnAddToCart();
        sleep();
        ShoppingCart proceedCheckout = new ShoppingCart(driver);
        proceedCheckout.setProceedToCheckout();
        sleep();
        LoginPage message = new LoginPage(driver);
        String warning = message.getWarningMessage();
        sleep();
        assertEquals(warning, "You must sign on before attempting to check out. Please sign on and try checking out again.");



    }

    private void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
