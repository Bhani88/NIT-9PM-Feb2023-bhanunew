package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class image {
    public static void main(String[] args){
        driverClass dc = new driverClass("chrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        String s =driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//a[@aria-label='Amazon.in']")).click();
        System.out.println(driver.getCurrentUrl());
        String s1 = driver.getCurrentUrl();
        Assert.assertTrue(driver.getCurrentUrl().contains("nav_logo"));
//        Assert.assertFalse();
        Assert.assertNotEquals(s,s1);
//        Assert.assertEquals();
//        Assert.assertSame();
//        Assert.assertNotSame();
//        Assert.assertNull();
//        Assert.assertNotNull();
        driver.navigate().back();
    }
}
