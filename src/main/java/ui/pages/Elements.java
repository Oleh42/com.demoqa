package ui.pages;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import ui.PageObjectFactory;
import ui.pages.elements.*;

@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class Elements extends NavigationBarPage {
    private SelenideElement textBox = $x("//div[@class='accordion']/div[1]//li[@id='item-0']");
    private SelenideElement checkBox = $x("//div[@class='accordion']/div[1]//li[@id='item-1']");
    private SelenideElement radioButton = $x("//div[@class='accordion']/div[1]//li[@id='item-2']");
    private SelenideElement webTables = $x("//div[@class='accordion']/div[1]//li[@id='item-3']");
    private SelenideElement buttons = $x("//div[@class='accordion']/div[1]//li[@id='item-4']");
    private SelenideElement links = $x("//div[@class='accordion']/div[1]//li[@id='item-5']");
    private SelenideElement brokenLinksImages = $x("//div[@class='accordion']/div[1]//li[@id='item-6']");
    private SelenideElement uploadAndDownload = $x("//div[@class='accordion']/div[1]//li[@id='item-7']");
    private SelenideElement dynamicProperties = $x("//div[@class='accordion']/div[1]//li[@id='item-8']");

    public TextBoxPage openTextBoxPage() {
        textBox.click();
        return PageObjectFactory.getTextBoxPage();
    }

    public CheckBoxPage openCheckBoxPage() {
        checkBox.click();
        return PageObjectFactory.getCheckBoxPage();
    }

    public RadioButtonPage openRadioButtonPage() {
        radioButton.click();
        return PageObjectFactory.getRadioButtonPage();
    }

    public WebTablesPage openWebTablesPage() {
        webTables.click();
        return PageObjectFactory.getWebTablesPage();
    }

    public ButtonsPage openButtonsPage() {
        buttons.click();
        return PageObjectFactory.getButtonsPage();
    }

    public LinksPage openLinksPage() {
        links.click();
        return PageObjectFactory.getLinksPage();
    }

    public BrokenLinksImages openBrokenLinksImages() {
        brokenLinksImages.click();
        return PageObjectFactory.getBrokenLinksImages();
    }

    public UploadAndDownload openUploadAndDownload() {
        uploadAndDownload.click();
        return PageObjectFactory.getUploadAndDownload();
    }

    public DynamicProperties openDynamicProperties() {
        dynamicProperties.click();
        return PageObjectFactory.getDynamicProperties();
    }

}
