package infra.WebUtils;

import org.testng.Assert;

public class GeneralFunctions {
    static String urlprefex = "https://bit.ly/";
    int expectedLength = 8;

    public static void validateStirngLength(String url){
        System.out.println("Enter >> validateStirngLength ");
        String actualLength = url.split(urlprefex)[1];
        Assert.assertTrue(actualLength.length()<= 8, "String is less than as expected ");
    }
}
