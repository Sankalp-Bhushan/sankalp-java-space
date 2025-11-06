package SystemDesign.CreationalDesignPattern.AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        // Get Shape Factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        // Get Color Factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        Color red = colorFactory.getColor("red");
        red.fill();

        Color blue = colorFactory.getColor("blue");
        blue.fill();
    }
}
