package ui.pages;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import ui.PageObjectFactory;
import ui.pages.alertsFramesWindows.*;

@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class AlertsFramesWindows extends NavigationBarPage {

    private SelenideElement browserWindows = $x("//div[@class='accordion']/div[3]//li[@id='item-0']");
    private SelenideElement alerts = $x("//div[@class='accordion']/div[3]//li[@id='item-1']");
    private SelenideElement frames = $x("//div[@class='accordion']/div[3]//li[@id='item-2']");
    private SelenideElement nestedFrames = $x("//div[@class='accordion']/div[3]//li[@id='item-3']");
    private SelenideElement modalDialogs = $x("//div[@class='accordion']/div[3]//li[@id='item-4']");

    public BrowserWindowPage openBrowserWindowPage() {
        browserWindows.click();
        return PageObjectFactory.getBrowserWindowPage();
    }

    public AlertsPage openAlertsPage() {
        alerts.click();
        return PageObjectFactory.getAlertsPage();
    }

    public FramesPage openFramesPage() {
        frames.click();
        return PageObjectFactory.getFramesPage();
    }

    public NestedFramesPage openNestedFramesPage() {
        nestedFrames.click();
        return PageObjectFactory.getNestedFramesPage();
    }

    public ModalDialogsPage openModalDialogsPage() {
        modalDialogs.click();
        return PageObjectFactory.getModalDialogsPage();
    }
}
