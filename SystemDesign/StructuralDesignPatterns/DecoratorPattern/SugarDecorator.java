package SystemDesign.StructuralDesignPatterns.DecoratorPattern;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Beverage coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 5.0;
    }
}
