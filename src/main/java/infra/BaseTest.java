package infra;

import blocks.ShortenServiceBlock;
import infra.WebUtils.DriverManger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    // TODO may read this form external resource
    String url ="https://bitly.com/";


    @BeforeClass
    public  void initWebDriver(){
        System.out.println("**************************Start--BeforeClass**********************");
        DriverManger.initWebDriver();
        DriverManger.getCurrentDriver().get(url);
        ShortenServiceBlock.initHomePage();
        System.out.println("**************************End--BeforeClass************************");
    }


    @AfterClass
    public void quitDriver(){
        System.out.println("**************************Start--AfterClass**********************");
        DriverManger.getCurrentDriver().quit();
        System.out.println("**************************End--AfterClass************************");
    }

}
