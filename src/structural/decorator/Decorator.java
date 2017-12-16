package structural.decorator;

public class Decorator {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        System.out.println();

        Shape circle1 = new RedShapeDecorator(circle);
        circle1.draw();
    }
}
