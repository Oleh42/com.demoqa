import com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.WebDriverRunner;
import utils.PropertiesController;;

import static com.codeborne.selenide.Selenide.open;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){
//        WebDriverRunner.getWebDriver().get(PropertiesController.PROPERTY.baseUrl());
        open(PropertiesController.PROPERTY.baseUrl());

    }
}
