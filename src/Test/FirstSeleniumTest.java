package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSeleniumTest {
    public static void main (String[] args){
       // System.setProperty("webdriver.chrome.driver","/Users/sanvimanvi/IdeaProjects/SeleniumTest/chromeexe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev/");
        driver.quit();
    }
}
