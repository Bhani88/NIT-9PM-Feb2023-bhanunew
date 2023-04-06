package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.xpath("//span[text()='Forex']")).click();
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[contains(@placeholder,'Mobile')]")).sendKeys("1234567890");
        driver.findElement(By.xpath("//button[@class='getAppLinkBtn']")).click();
    }
}
