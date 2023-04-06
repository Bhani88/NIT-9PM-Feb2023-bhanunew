package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {
    public static void main(String[] args) throws InterruptedException {
        Selenium.src.test.java.Selenium.driverClass dc = new driverClass("chrome");
        WebDriver driver = new ChromeDriver();
        String path = System.getProperty("user.dir"); //Retrieves the path from where this program is executing
        System.out.println(path);
        driver.get(path+"\\test.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='checkbox']")).click();
    }
}
