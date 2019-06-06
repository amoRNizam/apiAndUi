package base.utils;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

    public static void waitElement(WebElement element, WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
//        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
//            return true;
//        }catch (TimeoutException e) {
//            return false;
//        }
    }

    public static void waitSec(int sec) {
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
