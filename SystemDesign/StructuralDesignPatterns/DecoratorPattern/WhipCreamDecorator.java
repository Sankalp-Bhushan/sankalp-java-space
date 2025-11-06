package SystemDesign.StructuralDesignPatterns.DecoratorPattern;

public class WhipCreamDecorator extends CoffeeDecorator {

    public WhipCreamDecorator(Beverage coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 20.0;
    }
}
