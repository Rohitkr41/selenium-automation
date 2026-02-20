package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    static {
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}




//package utils;
//
//import java.io.InputStream;
//import java.util.Properties;
//
//public class ConfigReader {
//
//    private static Properties prop = new Properties();
//
//    static {
//        try {
//            InputStream input = ConfigReader.class
//                    .getClassLoader()
//                    .getResourceAsStream("config.properties");
//
//            if (input == null) {
//                System.out.println("❌ config.properties file NOT FOUND");
//            } else {
//                prop.load(input);
//                System.out.println("✅ config.properties loaded successfully");
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static String getProperty(String key) {
//        return prop.getProperty(key);
//    }
//}
