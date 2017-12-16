package behavioural.strategy;

class Bird extends Animal {
    public Bird() {
        setSound("Tweet");

        setFlyingBehaviour(new CanFly());
    }
}
