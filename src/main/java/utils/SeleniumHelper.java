package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SeleniumHelper {

    public static Map getProperties() throws IOException {
        Map<String, String> mapValues = new HashMap<String, String>();

        FileReader reader = new FileReader("src/test/resources/config.properties");

        Properties properties = new Properties();
        properties.load(reader);

        mapValues.put("server", properties.getProperty("server"));
        mapValues.put("browser", properties.getProperty("browser"));
        mapValues.put("username", properties.getProperty("username"));
        mapValues.put("password", properties.getProperty("password"));

        return mapValues;
    }
}