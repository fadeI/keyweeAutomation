package shortenLnkStanityFlow;

import blocks.BaseBlocks;
import blocks.ShortenServiceBlock;
import infra.BaseTest;
import infra.WebUtils.GeneralFunctions;
import org.testng.annotations.Test;
import pages.ShortenServicePage;

public class SnatiyTestGroupsShortenTests extends BaseTest {

    String inputUrl = "https://www.microsoft.com/he-il/ignite-the-tour/tel-aviv?wt.mc_id=AID746565_QSG_PD_SCL_284288";



    @Test
    public void SimpleShortenTest(){
        //Get page title
        ShortenServiceBlock.fillTextFiledAndValidateCopyvisibility(inputUrl,true);
        String shortenLnk = ShortenServiceBlock.getShortenLnk();
        System.out.println("shortenLnk   = > " + shortenLnk);
        GeneralFunctions.validateStirngLength(shortenLnk);
        BaseBlocks.NavigateToNewUrlAndValidateResults(shortenLnk, inputUrl,true);

    }



}