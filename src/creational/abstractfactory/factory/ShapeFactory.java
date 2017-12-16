package creational.abstractfactory.factory;

import creational.abstractfactory.color.Color;
import creational.abstractfactory.shape.Circle;
import creational.abstractfactory.shape.Rectangle;
import creational.abstractfactory.shape.Shape;
import creational.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        } else if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}
