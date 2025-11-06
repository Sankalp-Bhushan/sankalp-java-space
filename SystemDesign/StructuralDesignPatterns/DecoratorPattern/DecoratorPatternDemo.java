package SystemDesign.StructuralDesignPatterns.DecoratorPattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Start with a plain coffee
        Beverage coffee = new PlainCoffee();
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getCost());

        // Add milk
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getCost());

        // Add sugar
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getCost());

        // Add whipped cream
        coffee = new WhipCreamDecorator(coffee);
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getCost());
    }
}
