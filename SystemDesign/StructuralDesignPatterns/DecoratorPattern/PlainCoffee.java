package SystemDesign.StructuralDesignPatterns.DecoratorPattern;

public class PlainCoffee implements Beverage {

    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}

