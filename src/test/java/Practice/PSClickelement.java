package Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PSClickelement {
    public static WebDriver driver;

    public static void clickonelementbyxpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }
    public static void clickonelementbyclassname(String classname){
        driver.findElement(By.className(classname)).click();
    }

        public static void main(String[] args) throws Exception {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivay\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.facebook.com//");
           clickonelementbyxpath("(//a[@data-testid='open-registration-form-button'])");
            Thread.sleep(4000);
           // driver.close();
            driver.get("https://www.youtube.com/");
            Thread.sleep(3000);
            clickonelementbyclassname("ytd-searchbox");
            Thread.sleep(2000);
            driver.close();
        }
    }




