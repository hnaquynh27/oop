package observer.pseu;

import java.io.File;

public class EmailAlertsListener implements EventListener {

    private String email;

    public EmailAlertsListener(String email) {
        this.email = email;
    }

    public void update(String eventType, File fileName) {
        System.out.println("Email to " + email + " " + eventType + " at " + fileName);
    }
}
