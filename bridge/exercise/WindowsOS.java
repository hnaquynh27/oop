package bridge.exercise;

public class WindowsOS implements OperatingSystem {
    public void startUp() {
        System.out.println("WindowsOS starts up.");
    }

    public void loadUrl(String url) {
        System.out.println("Load " + url + " from Edge.");
    }
}
