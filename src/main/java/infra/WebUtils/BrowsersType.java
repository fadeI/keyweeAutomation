package infra.WebUtils;

public enum BrowsersType {
    CHROME("Chrome", "\\src\\drivers\\chromedriver.exe");

    String browserType;
    String driverPath;

    BrowsersType(String driverType, String driverPath) {
        this.driverPath = driverPath;
        this.browserType = driverType;
    }

    public String getBrowserType() {
        return browserType;
    }
    public String getDriverPath() {
        return driverPath;
    }

}
