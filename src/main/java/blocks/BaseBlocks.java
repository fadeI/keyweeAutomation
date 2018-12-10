package blocks;


import infra.WebUtils.DriverManger;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.ShortenServicePage;

public class BaseBlocks {

    protected static ShortenServicePage shortenServicePage;

    public static void switchToNewTab() {
        System.out.println("Enter >> switchToNewTab ");
        DriverManger.switchToLastTab();
    }


    public static void validateUrlsEquality(String expectedUrl, boolean expected) {

        if (expected) {
            Assert.assertTrue(DriverManger.getCurrentDriver().equals(expectedUrl), "are equals as Expected ");
        } else {
            Assert.assertFalse(DriverManger.getCurrentDriver().equals(expectedUrl), "are not equals as Expected ");
        }
    }


    public static void NavigateToNewUrl(String shortenLnk) {
        DriverManger.getCurrentDriver().get(shortenLnk);
    }

    public static void NavigateToNewUrlAndValidateResults(String shortenLnk, String expectedString, boolean expected ) {
        System.out.println("Enter  >> NavigateToNewUrlAndValidateResults ");
        DriverManger.getCurrentDriver().get(shortenLnk);
        if (expected) {
            Assert.assertTrue(DriverManger.getCurrentDriver().getCurrentUrl().equals(expectedString), "Both Url are the same");
        } else {
            Assert.assertFalse(DriverManger.getCurrentDriver().getCurrentUrl().equals(expectedString), "Both Url are not  the same");
        }

    }

}
