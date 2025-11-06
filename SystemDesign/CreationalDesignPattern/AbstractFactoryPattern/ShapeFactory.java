package SystemDesign.CreationalDesignPattern.AbstractFactoryPattern;

// Concrete Factory to create Shape objects
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;

        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                throw new IllegalArgumentException("Unknown shape: " + shapeType);
        }
    }

    @Override
    public Color getColor(String colorType) {
        return null; // ShapeFactory doesn't produce colors
    }
}
