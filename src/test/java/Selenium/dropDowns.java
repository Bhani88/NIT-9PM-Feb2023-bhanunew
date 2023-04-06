package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDowns {
    public static void main(String[] args) throws Exception{
        Selenium.src.test.java.Selenium.driverClass dc = new driverClass("chrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[contains(@ajaxify,'spotlight')]")).click();
        Thread.sleep(3000);
        Select day = new Select(driver.findElement(By.xpath("//select[@title='Day']")));
        Thread.sleep(2000);
        day.selectByVisibleText("1");
        Select month = new Select(driver.findElement(By.xpath("//select[@title='Month']")));
        month.selectByValue("1");
        Select year = new Select(driver.findElement(By.xpath("//select[@title='Year']")));
        year.selectByIndex(27);
        List<WebElement> months = month.getOptions();
        for(int i =0;i<months.size();i++){
            System.out.println(months.get(i).getText());
        }
//        System.out.println(months);
    }
}
