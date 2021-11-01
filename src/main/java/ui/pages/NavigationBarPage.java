package ui.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import lombok.experimental.Accessors;
import ui.PageObjectFactory;

import static com.codeborne.selenide.Selenide.*;

@Accessors(chain = true)
@Data
public class NavigationBarPage {
    private SelenideElement elements = $x("//div[@class='accordion']/div[1]");
    private SelenideElement forms = $x("//div[@class='accordion']/div[2]");
    private SelenideElement alertsFrameWindows = $x("//div[@class='accordion']/div[3]");
    private SelenideElement widgets = $x("//div[@class='accordion']/div[4]");
    private SelenideElement interactions = $x("//div[@class='accordion']/div[5]");
    private SelenideElement bookStoreApp = $x("//div[@class='accordion']/div[6]");
    private SelenideElement closeAd = $x("//img[@alt='adplus-dvertising']");

    public void closeAd() {
        closeAd.click();
    }
    public Elements openElementsBar() {
        elements.click();
        return PageObjectFactory.getElements();
    }

    public Forms openFormsBar() {
        forms.click();
        return PageObjectFactory.getForms();
    }

    public AlertsFramesWindows openAlertsFramesWindowsBar() {
        alertsFrameWindows.click();
        return PageObjectFactory.getAlertFramesWindows();
    }

    public Widgets openWidgetsBar() {
        widgets.click();
        return PageObjectFactory.getWidgets();
    }

    public Interactions openInteractionBar() {
        interactions.click();
        return PageObjectFactory.getInteractions();
    }

    public BookStoreApp openBookStoreAppBar() {
        bookStoreApp.click();
        return PageObjectFactory.getBookStoreApp();
    }
}
