package SystemDesign.BehaviouralDesignPattern.VisitorPattern;

public class Main {
    public static void main(String[] args) {
        Element[] items = new Element[] {
                new Book(60, "1234"),
                new Book(40, "5678"),
                new Fruit(10, 2, "Apple"),
                new Fruit(5, 5, "Banana")
        };

        int total = calculatePrice(items);
        System.out.println("\nTotal Cost = " + total);
    }

    private static int calculatePrice(Element[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (Element item : items) {
            sum += item.accept(visitor);
        }
        return sum;
    }
}
