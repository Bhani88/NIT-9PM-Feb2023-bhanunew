package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class popUpsAndWindows {
    public static void main(String[] args) throws Exception{
        new driverClass("chrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String fbWindow = driver.getWindowHandle();
        System.out.println(fbWindow);
        driver.findElement(By.linkText("Instagram")).click();
        Thread.sleep(5000);
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);
        Iterator<String> it = windows.iterator();
        while(it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }
//        driver.close();
        driver.quit();
//        driver.switchTo().window("")
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("0123456789");
    }
}
