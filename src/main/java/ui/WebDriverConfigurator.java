package ui;


import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;

public class WebDriverConfigurator {
    private WebDriverConfigurator() {
    }

    public static void setChrome() {
        WebDriverManager.chromedriver().setup();
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("profile.content_settings.exceptions.automatic_downloads.*.setting", 1);
        chromePrefs.put("download.prompt_for_download",false);
        chromePrefs.put("unexpectedAlertBehaviour", "ignore");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("start-maximized", "force-maximize-mode",
                "no-default-browser-check", "ignore-certificate-errors", "lang=en");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        capabilities.setJavascriptEnabled(true);

        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;
        Configuration.browserCapabilities = capabilities;
    }
}
