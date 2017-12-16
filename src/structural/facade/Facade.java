package structural.facade;

public class Facade {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();
    }
}
