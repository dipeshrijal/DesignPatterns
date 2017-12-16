package behavioural.strategy;

public class Strategy {
    public static void main(String[] args) {
        Animal doggy = new Dog();
        System.out.println(doggy.getSound());
        System.out.println(doggy.getFly());

        doggy.setFlyingBehaviour(new CanFly());

        System.out.println(doggy.getFly());

        Animal amina = new Bird();
        System.out.println(amina.getSound());
        System.out.println(amina.getFly());
    }
}
