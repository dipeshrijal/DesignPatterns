package behavioural.template;

public class Football extends Game {
    @Override
    public void start() {
        System.out.println("Start the beautiful game of football");
    }

    @Override
    public void half() {
        System.out.println("After 45 mins");
    }

    @Override
    public void end() {
        System.out.println("display results");
    }
}
