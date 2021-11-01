package ui.pages.forms;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import ui.pages.Forms;

@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = false)
public class PracticeFormPage extends Forms {
    private SelenideElement firstNameField = $("#firstName");
    private SelenideElement lastNameField = $("#lastName");
    private SelenideElement userEmailField = $("#userEmail");
    private SelenideElement maleRadio = $("#gender-radio-1");
    private SelenideElement femaleRadio = $("#gender-radio-2");
    private SelenideElement otherRadio = $("#gender-radio-3");
    private SelenideElement userNumberField = $("#userNumber");
    private SelenideElement dateOfBirthField = $("#dateOfBirthInput");
    private SelenideElement subjectField = $("div.subjects-auto-complete__control");
    private SelenideElement sportCheckBox = $("#hobbies-checkbox-1");
    private SelenideElement readingCheckBox = $("#hobbies-checkbox-2");
    private SelenideElement musicCheckBox = $("#hobbies-checkbox-3");
    private SelenideElement uploadPictureBtn = $("#uploadPicture");
    private SelenideElement currentAddressField = $("#currentAddress");
    private SelenideElement stateDropDown = $("#state");
    private SelenideElement cityDropDown = $("#city");
    private SelenideElement submitBtn = $("#submit");

}
