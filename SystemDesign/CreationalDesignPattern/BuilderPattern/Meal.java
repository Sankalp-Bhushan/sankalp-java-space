package SystemDesign.CreationalDesignPattern.BuilderPattern;

/**
 * Product class that we want to build step-by-step.
 */
public class Meal {
    private String mainItem;
    private String sideItem;
    private String drink;
    private double price;

    public String getMainItem() {
        return mainItem;
    }

    public void setMainItem(String mainItem) {
        this.mainItem = mainItem;
    }

    public String getSideItem() {
        return sideItem;
    }

    public void setSideItem(String sideItem) {
        this.sideItem = sideItem;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Meal [Main Item=" + mainItem + ", Side Item=" + sideItem + ", Drink=" + drink + ", Price=" + price + "]";
    }
}
