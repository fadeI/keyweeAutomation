package shortenLnkStanityFlow;

import blocks.BaseBlocks;
import blocks.ShortenServiceBlock;
import infra.BaseTest;
import org.testng.annotations.Test;
import pages.ShortenServicePage;

public class SnatiyTestGroupsShortenTests extends BaseTest {

    String inputUrl = "https://www.microsoft.com/he-il/ignite-the-tour/tel-aviv?wt.mc_id=AID746565_QSG_PD_SCL_284288";

    @Test
    public void SimpleShortenTest() throws InterruptedException {
        //Get page title
        ShortenServiceBlock.fillTextFiledAndValidateCopyvisibility(inputUrl,true);
        ShortenServiceBlock.clickOnMostRecentUrl();
        BaseBlocks.switchToNewTab();
        BaseBlocks.validateUrlsEquality(inputUrl,true);

    }



}