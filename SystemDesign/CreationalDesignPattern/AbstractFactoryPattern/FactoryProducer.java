package SystemDesign.CreationalDesignPattern.AbstractFactoryPattern;

// Factory producer to get factories by type
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice == null) return null;

        switch (choice.toLowerCase()) {
            case "shape":
                return new ShapeFactory();
            case "color":
                return new ColorFactory();
            default:
                throw new IllegalArgumentException("Unknown factory type: " + choice);
        }
    }
}
