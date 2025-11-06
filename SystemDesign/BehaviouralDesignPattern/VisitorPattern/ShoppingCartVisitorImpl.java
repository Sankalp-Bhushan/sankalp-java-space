package SystemDesign.BehaviouralDesignPattern.VisitorPattern;

// Concrete Visitor Implementation
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int cost;
        // Apply discount if book price > 50
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
            System.out.println("Book ISBN::" + book.getIsbnNumber() + " | Discounted cost = " + cost);
        } else {
            cost = book.getPrice();
            System.out.println("Book ISBN::" + book.getIsbnNumber() + " | cost = " + cost);
        }
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost = " + cost);
        return cost;
    }
}
