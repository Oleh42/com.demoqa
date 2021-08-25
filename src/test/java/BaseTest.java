import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import ui.WebDriverConfigurator;
import utils.Browser;
import utils.PropertiesController;

public class BaseTest {

    PropertiesController property = PropertiesController.PROPERTY;

    @BeforeAll
    public static void beforeAll() {
        if (PropertiesController.PROPERTY.browser().equals(Browser.CHROME.toString())) {
            WebDriverConfigurator.setChrome();
        }
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));

    }

}
