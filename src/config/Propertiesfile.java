package config;

import java.io.*;
import java.util.Properties;

public class Propertiesfile {
    static Properties prop = new Properties();

    public static void main(String[] args) {
        readPropertiesFile();
        writePropertiesFile();
    }

    public static void readPropertiesFile() {

        try {
            InputStream input = new FileInputStream("/Users/sanvimanvi/IdeaProjects/SeleniumTest/src/config/config.properties");
            prop.load(input);
            prop.getProperty("browser");
            System.out.println(prop.getProperty("browser"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void writePropertiesFile() {
        try {
            OutputStream output = new FileOutputStream("/Users/sanvimanvi/IdeaProjects/SeleniumTest/src/config/config.properties");
            prop.setProperty("browser", "chrome");
            prop.setProperty("name","gaurav");
            prop.store(output,null);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
