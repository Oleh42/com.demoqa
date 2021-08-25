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
public class RadioButtonPage extends Elements {
    private SelenideElement yesRadio = $("#yesRadio");
    private SelenideElement impressiveRadio = $("#impressiveRadio");
    private SelenideElement noRadio = $("#noRadio");
    private SelenideElement successText = $("span.text-success");
}
