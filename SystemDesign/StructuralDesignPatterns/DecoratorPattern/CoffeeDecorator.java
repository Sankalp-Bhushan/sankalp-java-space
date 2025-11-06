package SystemDesign.StructuralDesignPatterns.DecoratorPattern;

public abstract class CoffeeDecorator implements Beverage {
    protected Beverage coffee;

    public CoffeeDecorator(Beverage coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription();
    }

    public double getCost() {
        return coffee.getCost();
    }
}

