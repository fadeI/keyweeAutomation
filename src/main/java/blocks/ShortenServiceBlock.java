package blocks;

import org.testng.Assert;
import pages.ShortenServicePage;

public class ShortenServiceBlock extends BaseBlocks {


    public static void initHomePage() {
        shortenServicePage = new ShortenServicePage();
    }

    public static void fillTextFiledAndValidateCopyvisibility(String url, boolean expected) throws InterruptedException {

        shortenServicePage.typeShortenLnk(url);
        shortenServicePage.clickOnShortenUrlButton();
        Thread.sleep(5000);
        if (expected)
            Assert.assertTrue(shortenServicePage.isCopyButtonVisible(), "CopyButton is visible as expected ");
        else {
            Assert.assertFalse(shortenServicePage.isCopyButtonVisible(), "CopyButton is  mot visible as expected ");
        }
    }


    public static void clickOnMostRecentUrl() {
        shortenServicePage.clickOnMostRecentUrl();

    }
}
