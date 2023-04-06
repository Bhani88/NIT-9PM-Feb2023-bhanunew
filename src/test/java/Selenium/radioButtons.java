package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtons {
    public static void main(String[] args) throws InterruptedException {
        driverClass dc = new driverClass("chrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[contains(@ajaxify,'spotlight')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='2']")).click();
        Thread.sleep(2000);
    }
}
