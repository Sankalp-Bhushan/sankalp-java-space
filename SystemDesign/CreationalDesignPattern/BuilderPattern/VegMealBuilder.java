package SystemDesign.CreationalDesignPattern.BuilderPattern;

/**
 * Concrete Builder - builds a vegetarian meal
 */
public class VegMealBuilder extends MealBuilder {

    @Override
    public void buildMainItem() {
        meal.setMainItem("Paneer Butter Masala");
    }

    @Override
    public void buildSideItem() {
        meal.setSideItem("Roti");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Mango Lassi");
    }

    @Override
    public void buildPrice() {
        meal.setPrice(250.00);
    }
}
