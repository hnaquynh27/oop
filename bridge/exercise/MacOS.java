package bridge.exercise;

public class MacOS implements OperatingSystem {
    public void startUp() {
        System.out.println("MacOS start up.");
    }

    public void loadUrl(String url) {
        System.out.println("Load " + url + " from Edge.");
    }
}
