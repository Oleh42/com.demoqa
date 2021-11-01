package ui.pages;

import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import ui.PageObjectFactory;
import ui.pages.forms.PracticeFormPage;

@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class Forms extends NavigationBarPage {
    private SelenideElement practiceForms = $x("//div[@class='accordion']/div[2]//li[@id='item-0']");

    public PracticeFormPage openPracticeFormPage() {
        practiceForms.click();
        return PageObjectFactory.getPracticeFormPage();
    }

}
