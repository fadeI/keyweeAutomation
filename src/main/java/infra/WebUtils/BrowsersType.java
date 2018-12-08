package infra.WebUtils;

public enum BrowsersType {
    CHROME("Chrome", "\\src\\drivers\\chromedriver.exe", "/src/drivers/chromedriver");

    String browserType;
    String driverPath;
    String linuxPath;

    BrowsersType(String driverType, String driverPath, String linuxPath) {
        this.driverPath = driverPath;
        this.browserType = driverType;
        this.linuxPath = linuxPath;
    }

    public String getBrowserType() {
        return browserType;
    }

    public String getDriverPath() {
        if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {
            return this.linuxPath;
        } else
            return driverPath;
    }

}
