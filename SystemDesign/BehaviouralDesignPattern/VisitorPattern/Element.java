package SystemDesign.BehaviouralDesignPattern.VisitorPattern;

// The Element interface declares the accept method
public interface Element {
    int accept(ShoppingCartVisitor visitor);
}
