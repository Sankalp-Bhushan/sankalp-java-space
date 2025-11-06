package SystemDesign.CreationalDesignPattern.BuilderPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {

        MealBuilder vegBuilder = new VegMealBuilder();
        MealDirector director1 = new MealDirector(vegBuilder);
        director1.constructMeal();
        Meal vegMeal = director1.getMeal();
        System.out.println("Veg Meal: " + vegMeal);

        MealBuilder nonVegBuilder = new NonVegMealBuilder();
        MealDirector director2 = new MealDirector(nonVegBuilder);
        director2.constructMeal();
        Meal nonVegMeal = director2.getMeal();
        System.out.println("Non-Veg Meal: " + nonVegMeal);
    }
}
