package driver.manager;

import org.openqa.selenium.WebDriver;
import configuration.LocalWebDriverProperties;


public class DriverManager {
    private static WebDriver driver;

    private DriverManager() {
    }

    public static WebDriver getWebDriver() {

        if (driver == null) {
          driver = BrowserFactory.getBrowser(LocalWebDriverProperties.getLocalBrowser());
        }

        return driver;
    }

    public static void disposeDriver(){
        driver.close();
        driver.quit();
        driver = null;
    }
}