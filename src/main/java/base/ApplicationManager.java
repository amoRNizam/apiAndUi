package base;

import base.enums.DriverPaths;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utility.WebDriverLogger;

import static java.lang.System.setProperty;

public class ApplicationManager {
    public static EventFiringWebDriver webDriver;

    private Configuration configuration = ConfigFactory.create(Configuration.class, System.getProperties());

    public void init() {

        try {
            if (configuration.browser().contains("hrome")) {
                setProperty("webdriver.chrome.driver", DriverPaths.chrome.value);
                webDriver = new EventFiringWebDriver(new ChromeDriver());
                webDriver.register(new WebDriverLogger());
            } else if (configuration.browser().contains("irefox")) {
                setProperty("webdriver.gecko.driver", DriverPaths.firefox.value);
                webDriver = new EventFiringWebDriver(new FirefoxDriver());
                webDriver.register(new WebDriverLogger());
            }
        } catch (NullPointerException e) { // если в свойствах проекта не указан браузер
            setProperty("webdriver.chrome.driver", DriverPaths.chrome.value);
            webDriver = new EventFiringWebDriver(new ChromeDriver());
            webDriver.register(new WebDriverLogger());
        }
        webDriver.manage().window().maximize();
    }

    public void stop() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
