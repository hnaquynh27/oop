package observer.pseu;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        //editor.events.subscribe("open", new LogOpenListener(src/observer/file.txt));
        editor.events.subscribe("save", new EmailAlertsListener("admin@gmail.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
