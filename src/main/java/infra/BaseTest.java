package infra;

import blocks.ShortenServiceBlock;
import infra.WebUtils.DriverManger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    // TODO may read this form external resource
    String url ="https://bitly.com/";
    //blocks


    @BeforeClass
    public  void initWebDriver(){
        DriverManger.initWebDriver();
        DriverManger.getCurrentDriver().get(url);
        ShortenServiceBlock.initHomePage();

    }


    @AfterClass
    public void quitDriver(){
        DriverManger.getCurrentDriver().quit();
    }

}
