package observer.pseu;

import observer.pseu.EventListener;

import java.io.File;

public class LogOpenListener implements EventListener {
    private File logIn;

    public LogOpenListener(File logIn) {
        this.logIn = logIn;
    }

    public void update(String eventType, File fileName) {
        System.out.println("Save to log " + logIn + " " + eventType + " at " + fileName);
    }
}
