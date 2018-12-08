package blocks;


import infra.WebUtils.DriverManger;
import org.testng.Assert;
import pages.ShortenServicePage;

public class BaseBlocks {

    protected  static ShortenServicePage shortenServicePage;

    public static void switchToNewTab() {
        System.out.println("Enter >> switchToNewTab ");
        DriverManger.switchToLastTab();
    }


    public static void validateUrlsEquality( String  expectedUrl , boolean expected ){

            if (expected){
                Assert.assertTrue(DriverManger.getCurrentDriver().equals(expectedUrl), "are equals as Expected ");
            }
            else {
                Assert.assertFalse(!DriverManger.getCurrentDriver().equals(expectedUrl), "are not equals as Expected ");
            }

    }





}
