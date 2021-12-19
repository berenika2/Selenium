package tests;
import org.testng.annotations.Test;
import page.objects.*;

import static org.testng.AssertJUnit.assertEquals;

public class AddItemToBasketAndCheckoutTest extends TestBase {
    @Test
    public void AddFishToBasketAndCheckout(){

        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        LoginPage loginPage = new LoginPage();
      loginPage.clickOnFishImageButton()
              .clickOnAngelFish()
              .clickOnAddToCart()
              .setProceedToCheckout();


        String warning = loginPage.getWarningMessage();
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
