package SystemDesign.CreationalDesignPattern.FactoryPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        // Create different shapes using factory
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();
    }
}
