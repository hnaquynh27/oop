package observer.excercise;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        System.out.println("Octal Obsever: " + Integer.toOctalString(subject.getState()));
    }
}
