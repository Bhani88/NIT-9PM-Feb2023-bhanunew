package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor {
    public static void main(String[] args){
        new driverClass("chrome");
        WebDriver driver = new ChromeDriver();
        String path = System.getProperty("user.dir"); //Retrieves the path from where this program is executing
        System.out.println(path);
        driver.get(path+"\\test.html");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//input[@id='text']"));
        js.executeScript("document.getElementById('checkbox').click()"); //Similar tp click()
        js.executeScript("document.getElementById('text').value='NIT9PM'"); //Similar to sendKeys()
        js.executeScript("document.getElementById('Female').checked=true"); //Similar to click()
//        js.executeScript("arguments[0].scrollIntoView(true);", element); //Similar to moveToElement()
    }
}
