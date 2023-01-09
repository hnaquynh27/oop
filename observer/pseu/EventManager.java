package observer.pseu;

import observer.pseu.EventListener;

import java.io.File;
import java.util.*;

public class EventManager {
    Map<String, List<observer.pseu.EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, observer.pseu.EventListener listener) {
        List<observer.pseu.EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, observer.pseu.EventListener listener) {
        List<observer.pseu.EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<observer.pseu.EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, file);
        }
    }
}
