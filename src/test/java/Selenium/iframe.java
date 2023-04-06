package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
    public static void main(String[] args){
        new Selenium.src.test.java.Selenium.driverClass("chrome");
        WebDriver driver = new ChromeDriver();
        String path = System.getProperty("user.dir"); //Retrieves the path from where this program is executing
        System.out.println(path);
        driver.get(path+"\\test.html");
        driver.manage().window().maximize();
//        driver.switchTo().frame("iFrame"); //Based on name attribute's value
//        driver.switchTo().frame(0); //Based on Frame index
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iFrame']"))); //Based on Xpath
        driver.findElement(By.xpath("//input[@id='Female']")).click();
        driver.switchTo().parentFrame();
//        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@id='checkbox']")).click();
    }
}
