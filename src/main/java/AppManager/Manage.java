package AppManager;

import Pages.GooglePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Manage {

    WebDriver w;
    GooglePage googlePage;

    public void launch() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("use-fake-ui-for-media-stream");    // этот аргумент для принятия разрешении доступа к микрофону
        w = new ChromeDriver(options);
        w.get("https://www.google.ru/");
        googlePage = new GooglePage(w);
    }

    public void stop() {
        w.quit();
    }

    public GooglePage getGooglePage() {
        return googlePage;
    }
}