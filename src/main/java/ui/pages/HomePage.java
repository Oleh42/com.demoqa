package ui.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import lombok.experimental.Accessors;
import ui.PageObjectFactory;

import static com.codeborne.selenide.Selenide.$x;

@Accessors(chain = true)
@Data
public class HomePage {
    private SelenideElement elements = $x("//div[@class='category-cards']/div[1]");
    private SelenideElement forms = $x("//div[@class='category-cards']/div[2]");
    private SelenideElement alertsFramesWindows = $x("//div[@class='category-cards']/div[3]");
    private SelenideElement widgets = $x("//div[@class='category-cards']/div[4]");
    private SelenideElement interactions = $x("//div[@class='category-cards']/div[5]");
    private SelenideElement bookStoreApp = $x("//div[@class='category-cards']/div[6]");

    public Elements goToElements() {
        elements.click();
        return PageObjectFactory.getElements();
    }

    public Forms goToForms() {
        forms.click();
        return PageObjectFactory.getForms();
    }

    public AlertsFramesWindows goToAlertsFramesWindows() {
        alertsFramesWindows.click();
        return PageObjectFactory.getAlertFramesWindows();
    }

    public Widgets goToWidgets() {
        widgets.click();
        return PageObjectFactory.getWidgets();
    }

    public Interactions goToInteractions() {
        interactions.click();
        return PageObjectFactory.getInteractions();
    }

    public BookStoreApp goToBookStoreApp() {
        bookStoreApp.click();
        return PageObjectFactory.getBookStoreApp();
    }
}
