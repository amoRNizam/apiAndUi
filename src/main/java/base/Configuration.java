package base;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"file:src/main/java/base/config/project.properties",
        "file:src/main/java/base/config/credentials.properties"})

public interface Configuration extends Config {

    @DefaultValue("https://www.yandex.ru")
    @Key("site.url")
    String siteUrl();

    @DefaultValue("Chrome")
    @Key("browser")
    String browser();

}
