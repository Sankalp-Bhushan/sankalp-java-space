package SystemDesign.CreationalDesignPattern.FactoryPattern;

/**
 * Factory class that decides which object to create based on input.
 */
public class ShapeFactory {

    // Factory method to return a specific shape object
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }
}
