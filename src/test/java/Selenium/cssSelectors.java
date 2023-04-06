package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectors {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("input#email")).sendKeys("NIT6PM@yahoo.com");
        driver.findElement(By.cssSelector("input#pass")).sendKeys("12245236346");
        driver.findElement(By.name("login")).click();
    }
}
