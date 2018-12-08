package infra.WebUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTextUtils {

    public static void typeText(By by, String value){
        try {
            WebElement element = DriverManger.getCurrentDriver().findElement(by);
            element.clear();
            element.sendKeys(value);
        }
        catch (Exception e){
            System.out.println( "Failed while typing value");
            System.out.println( e.getMessage() );
        }
    }

    public static String getText(By by) {
        try {
            WebElement element = DriverManger.getCurrentDriver().findElement(by);
            return  element.getText();
        }
        catch (Exception e){
            System.out.println( "Failed while typing value");
            System.out.println( e.getMessage() );
            return  null;
        }
    }
}
