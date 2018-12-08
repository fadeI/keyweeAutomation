package blocks;

import org.testng.Assert;
import pages.ShortenServicePage;

public class ShortenServiceBlock extends BaseBlocks {


    public static void initHomePage() {
        shortenServicePage = new ShortenServicePage();
    }

    public static void fillTextFiledAndValidateCopyvisibility(String url, boolean expected) throws InterruptedException {
        System.out.println("Enter >> fillTextFiledAndValidateCopyVisibility ");
        shortenServicePage.typeShortenLnk(url);
        shortenServicePage.clickOnShortenUrlButton();

        if (expected)
            Assert.assertTrue(shortenServicePage.isCopyButtonVisible(), "CopyButton is visible as expected ");
        else {
            Assert.assertFalse(shortenServicePage.isCopyButtonVisible(), "CopyButton is  mot visible as expected ");
        }
    }


    public static String getShortenLnk() {
        return  shortenServicePage.getShortenLnk();
    }


}
