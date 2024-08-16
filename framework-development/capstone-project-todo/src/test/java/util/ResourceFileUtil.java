package util;

import java.io.*;
import java.util.Properties;

public class ResourceFileUtil {
    public static String getTestConfigValue(String key) {
        InputStream inputStream = null;
        try {
            inputStream = ClassLoader.getSystemResourceAsStream("test-config.properties");
            System.out.println("Reading test-config.properties");
            Properties properties = new Properties();
            properties.load(inputStream);

            return properties.getProperty(key);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getTestConfigValue("applicationURL"));
        System.out.println(getTestConfigValue("username"));
    }
}
