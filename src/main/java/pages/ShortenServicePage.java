package pages;

import infra.BasePage;
import infra.WebUtils.WebButtonUtils;
import infra.WebUtils.WebElementUtils;
import infra.WebUtils.WebTextUtils;
import org.openqa.selenium.By;

public class ShortenServicePage extends BasePage {

    String shortenTextID = "shorten_url";
    String shortenButtonId = "shorten_btn";
    String copyButtonID ="copy_shortlink";
    String clearActiveShortenLnk = "clear_active_shorten";
    String mostRecentUrlXpath = "//ul[@id='most_recent_link']//a[@class = 'short-url']";




    public  void clickOnMostRecentUrl() {
        System.out.println("Enter >> clickOnMostRecentUrl " );
        WebButtonUtils.clickOnElement(By.xpath(mostRecentUrlXpath));
    }

    public void typeShortenLnk(String shortenLink){
        System.out.println("Enter >> typeShortenLnk type url" + shortenLink);
        WebTextUtils.typeText(By.id(shortenTextID),shortenLink);
    }

    public void clickOnShortenUrlButton(){
        System.out.println("Enter >> clickOnShortenUrlButton");
        WebButtonUtils.clickOnElement(By.id(shortenButtonId));
    }

    public void clickOnCopyButton(){
        WebButtonUtils.clickOnElement(By.id(copyButtonID));
    }

    public void clearActiveShortenLnk(){
        WebButtonUtils.clickOnElement(By.id(clearActiveShortenLnk));
    }


    public boolean isCopyButtonVisible() {
        return WebElementUtils.isElementVisible(By.id(copyButtonID));
    }
}

