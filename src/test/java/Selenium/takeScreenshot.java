package Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class takeScreenshot {
    public static void main(String[] args) throws IOException {
        driverClass dc = new driverClass("chrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        System.out.println(source);
        FileUtils.copyFile(source, new File("./facebook.png"));
    }
}
