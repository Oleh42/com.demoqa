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
public class UploadAndDownload extends Elements {
    private SelenideElement downloadBtn = $("#downloadButton");
    private SelenideElement uploadFileBtn = $("#uploadFile");
}
