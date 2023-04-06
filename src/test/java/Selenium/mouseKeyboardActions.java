package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouseKeyboardActions {
    public static void main(String[] args) throws Exception{
        new driverClass("chrome");
        WebDriver driver = new ChromeDriver();
        String path = System.getProperty("user.dir"); //Retrieves the path from where this program is executing
        System.out.println(path);
        driver.get(path+"\\test.html");
//        driver.get("https://www.facebook.com/");
//        driver.get("https://www.amazon.in/");
//        driver.get("https://emicalculator.net/");
//        Thread.sleep(5000);
//        WebElement rightClick = driver.findElement(By.xpath("//button[@name='login']"));
        driver.manage().window().maximize();
//        WebElement imdb = driver.findElement(By.xpath("//a[text()='IMDb']"));
//        WebElement slider = driver.findElement(By.xpath("//div[contains(@id,'loanamountslider')]"));
        WebElement type1 = driver.findElement(By.id("text"));
        WebElement type2 = driver.findElement(By.id("text2"));

        Actions actions = new Actions(driver);
//        Action action = actions.contextClick(rightClick).build();
//        Action action = actions.clickAndHold(rightClick).release().build();
//        Action action = actions.doubleClick(rightClick).build();
//        Action action = actions.moveToElement(imdb).build();
//        Action action = actions.moveByOffset(40,0).build();
//        Action action = actions.dragAndDropBy(slider, 30,0).build();
        Action action = actions.moveToElement(type1).click().sendKeys("NIT9PM").keyDown(Keys.CONTROL).sendKeys("A").sendKeys("C")
                .keyUp(Keys.CONTROL).moveToElement(type2).click().keyDown(Keys.CONTROL).sendKeys("V").build();
        Thread.sleep(2000);
        action.perform();
//        imdb.click();
    }
}

//Mouse Actions

//click() - No Parameters
//contextClick() - Right Click - WebElement is parameter
//clickAndHold() - WebElement is parameter
//release()
//doubleClick() - WebElement is parameter
//dragAndDrop(source, target) - Source and Target are x & y coordinates
//dragAndDropBy(WebElement, source, target)
//moveToElement() - WebElement is parameter
//moveByOffset() - x and y coordinates are the parameters

//Keyboard Actions

//sendKeys() - No Parameters
//keyDown() - Key is Parameter
//keyUp() - Key is Parameter

