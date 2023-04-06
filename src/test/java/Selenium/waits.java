package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waits {
    //Implicit Wait
    //Explicit Wait
    //Fluent Wait
    public static void main(String[] args) throws Exception{
        new driverClass("chrome");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.cricbuzz.com/live-cricket-scores");
//        Thread.sleep(5000);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        System.out.println("Hello");

        driver.get("https://www.cricbuzz.com/live-cricket-scores/");
//        driver.findElement(By.xpath("//a[contains(@href,'hotels')]")).click();
        driver.findElement(By.xpath("//a[contains(@title,'Chennai Super Kings')]")).click();
        WebElement element = driver.findElement(By.xpath("//a[text()=' Full Commentary']"));
        element.click();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.titleContains("Commentary"));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[contains(@ng-bind-html,'comm')]"))));
        System.out.println(driver.findElement(By.xpath("//p[contains(@ng-bind-html,'comm')]")).getText());
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[contains(text(),'Luxe properties')]"))));
//        driver.findElement(By.xpath("//p[contains(text(),'Luxe properties')]")).click();

//        Wait wait1 = new FluentWait(driver).withTimeout(10,TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS)
//                .ignoring(Exception.class);
//        wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath())));
    }
}
