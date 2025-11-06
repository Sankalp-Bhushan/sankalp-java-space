package SystemDesign.CreationalDesignPattern.AbstractFactoryPattern;

// Abstract Factory class defining abstract creation methods
public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
    abstract Color getColor(String colorType);
}
