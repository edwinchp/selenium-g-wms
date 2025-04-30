package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static final Properties properties = new Properties();

    static {
        try (InputStream input = ConfigReader.class
                .getClassLoader()
                .getResourceAsStream("config.properties")) {

            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties: " + e.getMessage(), e);
        }
    }

    private static String get(String key) {
        return properties.getProperty(key);
    }

    public static String getUsername() {
        return get("APP_USERNAME");
    }

    public static String getPassword() {
        return get("APP_PASSWORD");
    }

    public static String getBaseUrl() {
        return get("BASE_URL");
    }
}
