package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class classTagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tsrtconline.in/oprs-web/");
        List<WebElement> elements =  driver.findElements(By.tagName("input"));
        System.out.println("No. of Input Tags are: "+elements.size());
        driver.findElement(By.className("chkavailabilityBtn")).click();
    }
}
