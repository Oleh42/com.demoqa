import static com.codeborne.selenide.Selenide.open;

import ie.corballis.fixtures.annotation.Fixture;
import ie.corballis.fixtures.annotation.FixtureAnnotations;
import ie.corballis.fixtures.settings.Settings;
import models.UserModel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import ui.PageObjectFactory;
import ui.pages.Elements;
import ui.pages.Forms;
import ui.pages.HomePage;
import ui.pages.elements.CheckBoxPage;
import ui.pages.elements.TextBoxPage;
import utils.PropertiesController;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestDemo extends BaseTest {
    HomePage homePage;
    Forms forms;
    Elements elements;
    TextBoxPage textBoxPage;
    CheckBoxPage checkBoxPage;

    @Fixture("user")
    UserModel model;

    @BeforeAll
    public void beforeTest() throws Exception {
        FixtureAnnotations.initFixtures(this, new Settings.Builder().useFolderFixtureScanner("src/test/resources/fixtures"));
    }

    @Test
    public void test() throws Exception {
//        WebDriverRunner.getWebDriver().get(PropertiesController.PROPERTY.baseUrl());
        open(PropertiesController.PROPERTY.baseUrl());
        textBoxPage = PageObjectFactory.getHomePage().goToElements().openTextBox();
        textBoxPage.getFullName().val(model.getFullName());
        textBoxPage.getEmail().val(model.getEmail());
        textBoxPage.getCurrentAddress().val(model.getCurrentAddress());
        textBoxPage.getPermanentAddress().val(model.getPermanentAddress());
        textBoxPage.getSubmitBtn().click();
    }

    @Test
    public void checkBoxTest() throws InterruptedException {
        open(PropertiesController.PROPERTY.baseUrl());
        checkBoxPage = PageObjectFactory.getHomePage().goToElements().openCheckBoxPage();
        checkBoxPage.getExpandAllBtn().click();
    }
}
