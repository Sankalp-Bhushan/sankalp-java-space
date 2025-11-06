package SystemDesign.CreationalDesignPattern.BuilderPattern;

/**
 * Concrete Builder - builds a non-vegetarian meal
 */
public class NonVegMealBuilder extends MealBuilder {

    @Override
    public void buildMainItem() {
        meal.setMainItem("Butter Chicken");
    }

    @Override
    public void buildSideItem() {
        meal.setSideItem("Naan");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Coke");
    }

    @Override
    public void buildPrice() {
        meal.setPrice(350.00);
    }
}
