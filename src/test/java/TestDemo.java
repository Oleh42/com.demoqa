import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.*;

import ie.corballis.fixtures.annotation.Fixture;
import ie.corballis.fixtures.annotation.FixtureAnnotations;
import ie.corballis.fixtures.settings.Settings;
import models.RegistrationModel;
import models.UserModel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import ui.PageObjectFactory;
import ui.pages.Elements;
import ui.pages.elements.ButtonsPage;
import ui.pages.elements.TextBoxPage;
import utils.PropertiesController;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;

@Epic("DemoQA tests")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestDemo extends BaseTest {
    TextBoxPage textBoxPage;
    ButtonsPage buttonsPage;
    Elements elements;

    @Fixture("user")
    UserModel model;
    RegistrationModel registrationModel;

    @BeforeAll
    public void beforeTest() throws Exception {
        FixtureAnnotations.initFixtures(this, new Settings.Builder().useFolderFixtureScanner("src/test/resources/fixtures"));
    }

    @BeforeEach
    public void beforeEach() {
        open(PropertiesController.PROPERTY.baseUrl());
    }

    @Story("Text Box")
    @Test
    public void textBoxTest() {
        textBoxPage = PageObjectFactory.getHomePage().goToElements().openTextBoxPage();
        textBoxPage.closeAd();
        textBoxPage.getFullName().val(model.getFullName());
        textBoxPage.getEmail().val(model.getEmail());
        textBoxPage.getCurrentAddress().val(model.getCurrentAddress());
        textBoxPage.getPermanentAddress().val(model.getPermanentAddress());
        textBoxPage.getSubmitBtn().click();
        assertEquals("Name:" + model.getFullName(), textBoxPage.getNameAs().getText());
        assertEquals("Email:" + model.getEmail(), textBoxPage.getEmailAs().getText());
        assertEquals("Current Address :" + model.getCurrentAddress(), textBoxPage.getCurrentAddressAs().getText());
        assertEquals("Permananet Address :" + model.getPermanentAddress(), textBoxPage.getPermanentAddressAs().getText());
    }

    @Test
    public void buttonsTest() {
        elements = PageObjectFactory.getHomePage().goToElements();
        elements.closeAd();
        buttonsPage = elements.openButtonsPage();
        buttonsPage.getDoubleClickBtn().doubleClick();
        assertTrue(buttonsPage.getDoubleClickMessage().isDisplayed());
        buttonsPage.getRightClickBtn().contextClick();
        assertTrue(buttonsPage.getRightClickMessage().isDisplayed());
        buttonsPage.getDynamicClickMessage().hover().click();
          assertTrue(buttonsPage.getDynamicClickMessage().isDisplayed());
    }
}
