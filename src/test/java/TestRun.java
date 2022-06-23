import org.testng.annotations.Test;

import static AppManager.HelperBase.sleepingTime;
import static AppManager.Sound.playSound;

public class TestRun extends TestBase {

    @Test
    public void runTestVoiceInputInGoogleSearch() {
        mg.getGooglePage().checkUrl().clickButtonMicrophone();
        playSound("/Users/alfa/Desktop/learnJava/music/sound/voice.aiff").join();    //Формат wav не подошел. Пришлось aiff использовать
        sleepingTime(1);
        mg.getGooglePage().visibleQueryHelloGoogle();
    }
}