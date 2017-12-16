package behavioural.template;

abstract class Game {

    public abstract void start();

    public abstract void half();

    public abstract void end();

    public final void play() {
        start();
        half();
        end();
    }
}
