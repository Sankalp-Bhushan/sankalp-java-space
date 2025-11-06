package SystemDesign.StructuralDesignPatterns.DecoratorPattern;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Beverage coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 10.0;
    }
}

