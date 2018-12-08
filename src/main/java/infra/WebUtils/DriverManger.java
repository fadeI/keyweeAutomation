package infra.WebUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class DriverManger {

    static WebDriver driver;
    static BrowsersType browsersType;


    private static BrowsersType getBrowserType() {
        // TODO may read this form external resource
        String browserType = "Chrome";
        if (browserType.equals(BrowsersType.CHROME.getBrowserType())) {
            return BrowsersType.CHROME;
        }
        return null;
    }

    public static void initWebDriver() {
        browsersType = getBrowserType();
        String workingDir = System.getProperty("user.dir");
        if (browsersType.getBrowserType().equals(BrowsersType.CHROME.getBrowserType())) {
            System.setProperty("webdriver.chrome.driver", workingDir + browsersType.getDriverPath());
            ChromeOptions options = new ChromeOptions();
            if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {
                options.addArguments("headless");
            }else {
                options.addArguments("--start-maximized");
            }
            driver = new ChromeDriver(options);

        }
    }

    public static WebDriver getCurrentDriver() {
        return driver;
    }

    public static void switchToLastTab() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public static String getUrl() {
        return driver.getCurrentUrl();
    }

    public static void SwitchToFirlstTab() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
    }

    public static void closeallTabs() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        for (int i = 0; i < tabs.size(); i++) {
            driver.switchTo().window(tabs.get(i));
            driver.close();
        }
    }

}






