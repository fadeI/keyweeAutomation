package blocks;

import org.testng.Assert;
import pages.ShortenServicePage;

public class ShortenServiceBlock extends BaseBlocks {


    public static void initHomePage() {
        shortenServicePage = new ShortenServicePage();
    }

    public static void fillTextFiledAndValidateCopyvisibility(String url, boolean expected) {
        try {
            System.out.println("Enter >> fillTextFiledAndValidateCopyVisibility ");
            shortenServicePage.typeShortenLnk(url);
            Thread.sleep(2000); // This is mandatory
            shortenServicePage.clickOnShortenUrlButton();
            if (expected) {
                shortenServicePage.isXuttonAppears();
                Assert.assertTrue(shortenServicePage.isCopyButtonVisible(), "CopyButton is visible as expected ");
            } else {
                Assert.assertFalse(shortenServicePage.isCopyButtonVisible(), "CopyButton is  mot visible as expected ");
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }


    public static String getShortenLnk() {
        System.out.println("Enter >> getShortenLnk ");
        return shortenServicePage.getShortenLnk();
    }


}
