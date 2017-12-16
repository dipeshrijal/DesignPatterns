package behavioural.strategy;

class Dog extends Animal {

    public Dog() {
        setSound("Bark");

        setFlyingBehaviour(new CantFly());
    }
}
