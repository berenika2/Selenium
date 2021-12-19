package tests;

import driver.manager.DriverUtils;
import org.testng.annotations.Test;
import page.objects.LandingPage;
import page.objects.LoginPage;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.AssertJUnit.assertEquals;

public class FailedLoginTest extends TestBase{

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {
        DriverUtils.navigateToPage(LOGIN_URL);

        LandingPage landingPage = new LandingPage();
        sleep();
        landingPage.clickOnEnterStoreLink()
                .clickOnSignInLink()
                .typeIntoUserNameField("Nonextstinguser")
                .typeIntoPasswordField("password")
                .clickOnLoginButton();

        LoginPage loginPage = new LoginPage();
        String warningMessage = loginPage.getWarningMessage();

        assertEquals(warningMessage, "Invalid username or password. Signon failed.");
    }
    private void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}