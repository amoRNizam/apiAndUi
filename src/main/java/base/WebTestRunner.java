package base;

import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import static base.utils.NetworkHelper.getStatusCodeOfServer;

public class WebTestRunner extends ApplicationManager {

    private Configuration configuration = ConfigFactory.create(Configuration.class, System.getProperties());

    @BeforeMethod
    public void setUp() throws IOException {
        /* Проверим код ответа сервера */
        getStatusCodeOfServer(configuration.siteUrl());
        init();
        webDriver.get(configuration.siteUrl());
    }

    @AfterMethod
    public void tearDown() {
        stop();
    }

    public void goToWebsite() {
        webDriver.get(configuration.siteUrl());
    }
}
