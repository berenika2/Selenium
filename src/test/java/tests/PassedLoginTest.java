package tests;

import driver.manager.DriverUtils;
import org.testng.annotations.Test;
import page.objects.*;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertTrue;

public class PassedLoginTest extends TestBase{

    @Test
    public void asUserLoginUsingValidLoginAndPassword() {
        DriverUtils.navigateToPage(LOGIN_URL);

        LandingPage landingPage = new LandingPage();
        boolean isBannerAfterLoginDisplayed = landingPage
                .clickOnEnterStoreLink()
                .clickOnSignInLink()
                .typeIntoUserNameField("123")
                .typeIntoPasswordField("test123test")
                .clickOnLoginButton()
                .isBannerAfterLoginDisplayed();

        assertTrue(isBannerAfterLoginDisplayed);
    }

}
