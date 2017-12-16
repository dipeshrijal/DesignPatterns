package behavioural.template;

public class Cricket extends Game {
    @Override
    public void start() {
        System.out.println("Boring game");
    }

    @Override
    public void half() {
        System.out.println("first innings completed");
    }

    @Override
    public void end() {
        System.out.println("finish the boring game.");
    }
}
