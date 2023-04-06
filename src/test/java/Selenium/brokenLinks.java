package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class brokenLinks {
    public static void main(String[] args) throws Exception{
        new Selenium.src.test.java.Selenium.driverClass("chrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/in/");
        Thread.sleep(5000);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        int brokenLink = 0, workingLink = 0;
        for(WebElement e : links){
            String href = e.getAttribute("href");
            try{
                URL url = new URL(href);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                Thread.sleep(2000);
                if(connection.getResponseCode()>399){
                    System.out.println("Broken Link: "+url);
                    brokenLink++;
                }
                else{
                    System.out.println("Working Link: "+url);
                    workingLink++;
                }
            }
            catch(Exception ee){
                System.out.println(ee);
            }
        }
        System.out.println("Total Working Links: "+workingLink);
        System.out.println("Total Broken Links: "+brokenLink);
    }
}
