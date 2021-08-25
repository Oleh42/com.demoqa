package utils;

public enum Browser {
    CHROME("chrome");
    private String browserName;

    Browser(String browserName) {
        this.browserName = browserName;
    }

    public String toString() {
        return browserName;
    }
}
