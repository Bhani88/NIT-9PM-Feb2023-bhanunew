package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) throws Exception{
        new Selenium.src.test.java.Selenium.driverClass("chrome");
        WebDriver driver = new ChromeDriver();
        String path = System.getProperty("user.dir"); //Retrieves the path from where this program is executing
        System.out.println(path);
        driver.get(path + "\\test.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@name='alert']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@name='confirm']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//button[@name='prompt']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("NIT9PM");
        driver.switchTo().alert().accept();
        System.out.println(driver.switchTo().alert().getText());
    }
}
