package behavioural.observer;

public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new OctalObserver(subject);
        new HexObserver(subject);

        subject.setState(15);

        System.out.println("=====================");

        subject.setState(10);
    }
}
