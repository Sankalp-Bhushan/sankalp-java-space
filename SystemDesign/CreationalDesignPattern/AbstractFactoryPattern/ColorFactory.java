package SystemDesign.CreationalDesignPattern.AbstractFactoryPattern;

// Concrete Factory to create Color objects
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null; // ColorFactory doesn't produce shapes
    }

    @Override
    public Color getColor(String colorType) {
        if (colorType == null) return null;

        switch (colorType.toLowerCase()) {
            case "red":
                return new Red();
            case "blue":
                return new Blue();
            case "green":
                return new Green();
            default:
                throw new IllegalArgumentException("Unknown color: " + colorType);
        }
    }
}
