package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ResourceFileUtilRefactored {

    private static ResourceFileUtilRefactored instance;
    private  Properties properties;
    private ResourceFileUtilRefactored(){
        properties = new Properties();
        loadProperties();
    }

    private void loadProperties() {
        try(InputStream inputStream = ClassLoader.getSystemResourceAsStream("test-config.properties")){
            System.out.println("Reading test-config.properties");
            properties.load(inputStream);
        }
        catch(IOException ex){
            throw new RuntimeException("Error loading properties file",ex);
        }
    }


    public static  ResourceFileUtilRefactored getInstance(){
        if(instance== null){
            instance = new ResourceFileUtilRefactored();
        }
        return instance;
    }

    public  String getTestConfigValue(String key){
        return this.properties.getProperty(key);
    }
}
