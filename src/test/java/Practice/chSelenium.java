package Practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class chSelenium {

    static chSelenium ch;
    static WebDriver driver;
    public void clickonElement(WebElement element, String elementName) {

        try {
            element.click();
//            ch.screenShot(driver);

            System.out.println("Sucessfully clicked the element " +elementName);
        }
        catch (NoSuchElementException e) {
//            ch.screenShot(driver);
            System.out.println("Element "+elementName+" not found");
        }

    }

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","\\C:\\Users\\saran\\IdeaProjects\\NIT-9PM-Feb2023\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(4000);
        WebElement element = driver.findElement(By.xpath("//button[text()='Customer Login']"));
        ch = new chSelenium();
        ch.clickonElement(element,"Customer Login");
    }

    public void screenShot(WebDriver driver) {
        TakesScreenshot banking = (TakesScreenshot) driver;
        File source = banking.getScreenshotAs(OutputType.FILE);
        System.out.println(source);
        try {
            FileUtils.copyFile(source, new File("./bank.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
