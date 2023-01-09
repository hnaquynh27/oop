package observer.excercise;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        System.out.println("Hexa Observer: " + Integer.toHexString(subject.getState()));
    }
}
