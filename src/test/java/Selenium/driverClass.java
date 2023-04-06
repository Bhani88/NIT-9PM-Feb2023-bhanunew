package Selenium.src.test.java.Selenium;

public class driverClass {
    String filePath = System.getProperty("user.dir"); //Prints the directory from which the program is being executed

    String getChromeDriverPath() {
        String ChromeDriverPath = filePath.replace("\\", "\\\\") + "\\\\chromedriver.exe";
//        System.out.println(filePath + " " + ChromeDriverPath);
        return ChromeDriverPath;
    }

    String getFireFoxDriverPath() {
        String FireFoxDriverPath = filePath.replace("\\", "\\\\") + "\\\\geckodriver.exe";
//        System.out.println(filePath + " " + FireFoxDriverPath);
        return FireFoxDriverPath;
    }

    public driverClass(String driverType) {
        if (driverType.equalsIgnoreCase("chrome")) {
            System.out.println("Setting up the Chrome Driver Path");
            System.setProperty("webdriver.chrome.driver", getChromeDriverPath());
            System.out.println("Starting the Chrome Driver");
        }
        if (driverType.equalsIgnoreCase("firefox")) {
            System.out.println("Setting up the Gecko Driver Path");
            System.setProperty("webdriver.gecko.driver", getFireFoxDriverPath());
            System.out.println("Starting the Gecko Driver");
        }
    }
}


//System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe"); - To start IE Browser
//InternetExplorerDriver ie=new InternetExplorerDriver();
