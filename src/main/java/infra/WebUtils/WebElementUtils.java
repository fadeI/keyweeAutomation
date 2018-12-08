package infra.WebUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

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

    public static void openNewTabByElement(By by ){
        try{
        WebElement element =DriverManger.getCurrentDriver().findElement(by);
            element.sendKeys(Keys.CONTROL +"t");
        }
        catch (Exception e ){

        }

    }

}
