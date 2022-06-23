package AppManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {

    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void click(By by) {
        wd.findElement(by).click();
    }

    public String getUrl() {
        return wd.getCurrentUrl();
    }

    public void visibleElement(By by) {
        wd.findElement(by).isDisplayed();
    }

    public static void sleepingTime(int sec)  {
        try {
            Thread.sleep(1000L *sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}