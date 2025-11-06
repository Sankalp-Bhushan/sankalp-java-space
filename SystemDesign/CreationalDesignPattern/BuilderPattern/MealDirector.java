package SystemDesign.CreationalDesignPattern.BuilderPattern;

/**
 * Director class defines the order of building steps.
 */
public class MealDirector {

    private MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public void constructMeal() {
        mealBuilder.buildMainItem();
        mealBuilder.buildSideItem();
        mealBuilder.buildDrink();
        mealBuilder.buildPrice();
    }

    public Meal getMeal() {
        return mealBuilder.getMeal();
    }
}
