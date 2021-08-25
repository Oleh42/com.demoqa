package ui.pages.elements;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import ui.pages.Elements;

@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = false)
public class TextBoxPage extends Elements {
    private SelenideElement fullName = $("#userName");
    private SelenideElement email = $("#userEmail");
    private SelenideElement currentAddress = $("#currentAddress");
    private SelenideElement permanentAddress = $("#permanentAddress");
    private SelenideElement submitBtn = $("#submit");
}
