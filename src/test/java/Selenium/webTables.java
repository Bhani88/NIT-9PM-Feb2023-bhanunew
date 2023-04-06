package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class webTables {
    public static void main(String[] args) {
        new driverClass("chrome");
        WebDriver driver = new ChromeDriver();
        String path = System.getProperty("user.dir"); //Retrieves the path from where this program is executing
        System.out.println(path);
        driver.get(path + "\\table.html");
        driver.manage().window().maximize();
        List<WebElement> rowElements = driver.findElements(By.xpath("//table//tbody//td"));
        List<WebElement> columnElements = driver.findElements(By.xpath("//thead//tr//th"));
        //        System.out.println(columnElements.get(0).getText() + " : "+ rowElements.get(0).getText());
//        System.out.println(columnElements.get(1).getText() + " : "+ rowElements.get(1).getText());
//        System.out.println(columnElements.get(2).getText() + " : "+ rowElements.get(2).getText());
//        System.out.println(columnElements.get(3).getText() + " : "+ rowElements.get(3).getText());
//        System.out.println(columnElements.get(0).getText() + " : "+ rowElements.get(4).getText());
//        System.out.println(columnElements.get(1).getText() + " : "+ rowElements.get(5).getText());
//        System.out.println(columnElements.get(2).getText() + " : "+ rowElements.get(6).getText());
//        System.out.println(columnElements.get(3).getText() + " : "+ rowElements.get(7).getText());
        int i = 0, j = 0;
        while (j < rowElements.size()) {
            while (i < columnElements.size()) {
                System.out.println(columnElements.get(i).getText() + " : " + rowElements.get(j).getText());
                i++;
                j++;
            }
            System.out.println("----------------------");
            i = 0;
        }
    }
}
