package creational.abstractfactory.factory;

import creational.abstractfactory.shape.Shape;
import creational.abstractfactory.color.Blue;
import creational.abstractfactory.color.Color;
import creational.abstractfactory.color.Green;
import creational.abstractfactory.color.Red;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        } else if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("Green")) {
            return new Green();
        } else if (color.equalsIgnoreCase("Blue")) {
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
