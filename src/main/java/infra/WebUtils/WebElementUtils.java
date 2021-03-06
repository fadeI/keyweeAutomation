package infra.WebUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementUtils {


    public static boolean isElementVisible(By by){
        try{

            WebElement element =DriverManger.getCurrentDriver().findElement(by);
            return  element.isDisplayed();
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
    public static  void waitUntilElementVisibility(By by) {
        System.out.println("Enter >> waitUntilElementVisibility");
            WebDriverWait wait = new WebDriverWait(DriverManger.getCurrentDriver(), 10);
            WebElement aboutMe = wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

}
