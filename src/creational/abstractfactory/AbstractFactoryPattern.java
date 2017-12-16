package creational.abstractfactory;

import creational.abstractfactory.color.Color;
import creational.abstractfactory.factory.AbstractFactory;
import creational.abstractfactory.factory.FactoryProducer;
import creational.abstractfactory.shape.Shape;

public class AbstractFactoryPattern {

    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("BLUE");
        color1.fill();

        Color color2 = colorFactory.getColor("RED");
        color2.fill();

        Color color3 = colorFactory.getColor("GREEN");
        color3.fill();

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
