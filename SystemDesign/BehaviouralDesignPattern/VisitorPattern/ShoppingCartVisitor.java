package SystemDesign.BehaviouralDesignPattern.VisitorPattern;

// Visitor interface — defines visit methods for each element type
public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
