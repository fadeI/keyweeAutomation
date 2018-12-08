package infra.WebUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementUtils {


    public static boolean isElementVisible(By by){
        try{

            WebElement element =DriverManger.getCurrentDriver().findElement(by);
            return element.isDisplayed();
        }
        catch (Exception e) {
            return false;

        }

    }
}
