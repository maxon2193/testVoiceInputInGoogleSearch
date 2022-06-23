package Pages;

import AppManager.HelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GooglePage extends HelperBase {

    public GooglePage(WebDriver wd) {
        super(wd);
    }

    public GooglePage checkUrl() {
        String url = getUrl();
        assertEquals(url, "https://www.google.ru/");
        return this;
    }

    public GooglePage clickButtonMicrophone() {
        click(By.xpath("//*[@aria-label=\"Голосовой поиск\"]"));
        return this;
    }

    public GooglePage visibleQueryHelloGoogle(){
        visibleElement(By.xpath("//*[@aria-label=\"Найти\" and @value=\"Привет Google\"]"));
        return this;
    }
}