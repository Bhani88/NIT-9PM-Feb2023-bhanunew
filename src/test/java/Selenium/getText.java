package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
    public static void main(String[] args){
        new Selenium.src.test.java.Selenium.driverClass("chrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebElement element = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
        String s = element.getText();
        System.out.println(s);
    }
}
