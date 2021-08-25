package utils;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources("classpath:config.properties")
public interface PropertiesController extends Config {
    PropertiesController PROPERTY = loadProperties();

    static PropertiesController loadProperties() {
        return ConfigFactory.create(
                PropertiesController.class, System.getProperties());
    }
    @Config.Key("base.url")
    String baseUrl();

    @Config.Key("browser")
    String browser();



}
