package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\XYZ\\Pictures\\NIT-9PM-Feb2023\\chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver","");
        ChromeDriver driver = new ChromeDriver();
//        FirefoxDriver driver1 = new FirefoxDriver();
//        WebDriver driver1 = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.close(); //driver.quit();
    }
}
