package infra.WebUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebButtonUtils {

    public static void clickOnElement(By by){
        try {
            WebElement element = DriverManger.getCurrentDriver().findElement(by);
            element.click();
        }
        catch (Exception e){
            System.out.println( "Failed while clicking on element");
            System.out.println( e.getMessage() );
        }
    }
}
