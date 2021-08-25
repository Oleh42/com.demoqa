package ui;

import ui.pages.*;
import ui.pages.elements.*;

import static com.codeborne.selenide.Selenide.page;

public class PageObjectFactory {

    public static HomePage getHomePage() {
        return page(HomePage.class);
    }

    public static NavigationBarPage getNavigationBarPage() {
        return page(NavigationBarPage.class);
    }

    public static Elements getElements() {
        return page(Elements.class);
    }

    public static Forms getForms() {
        return page(Forms.class);
    }

    public static AlertsFramesWindows getAlertFramesWindows() {
        return page(AlertsFramesWindows.class);
    }

    public static Widgets getWidgets() {
        return page(Widgets.class);
    }

    public static Interactions getInteractions() {
        return page(Interactions.class);
    }

    public static BookStoreApp getBookStoreApp() {
        return page(BookStoreApp.class);
    }

    public static TextBoxPage getTextBoxPage() {
        return page(TextBoxPage.class);
    }

    public static CheckBoxPage getCheckBoxPage() {
        return page(CheckBoxPage.class);
    }

    public static RadioButtonPage getRadioButtonPage() {
        return page(RadioButtonPage.class);
    }

    public static WebTablesPage getWebTablesPage() {
        return page(WebTablesPage.class);
    }

    public static ButtonsPage getButtonsPage() {
        return page(ButtonsPage.class);
    }

    public static LinksPage getLinksPage() {
        return page(LinksPage.class);
    }

    public static BrokenLinksImages getBrokenLinksImages() {
        return page(BrokenLinksImages.class);
    }

    public static UploadAndDownload getUploadAndDownload() {
        return page(UploadAndDownload.class);
    }

    public static DynamicProperties getDynamicProperties() {
        return page(DynamicProperties.class);
    }


}
