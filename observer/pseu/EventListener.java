package observer.pseu;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
