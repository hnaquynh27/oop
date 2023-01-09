package bridge.exercise;

public class Laptop extends Computer {

    public Laptop(OperatingSystem os) {
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
