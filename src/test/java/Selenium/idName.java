package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idName {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement element = driver.findElement(By.id("email"));
        element.sendKeys("NIT9PMFeb2023@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("0123456789");
        driver.findElement(By.name("login")).click();
    }
}
