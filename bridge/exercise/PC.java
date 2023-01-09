package bridge.exercise;

public class PC extends Computer {
    public PC(OperatingSystem os) {
        super(os);
    }

    public void startUp() {
        os.startUp();
    }

    public void browseInternet(String url) {
        os.loadUrl(url);
    }

    public boolean canMoveComputer() {
        return true;
    }
}
