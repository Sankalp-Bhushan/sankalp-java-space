package SystemDesign.CreationalDesignPattern.BuilderPattern;

/**
 * Abstract Builder defines the blueprint for building a meal.
 */
public abstract class MealBuilder {
    protected Meal meal = new Meal();

    public abstract void buildMainItem();
    public abstract void buildSideItem();
    public abstract void buildDrink();
    public abstract void buildPrice();

    public Meal getMeal() {
        return meal;
    }
}
