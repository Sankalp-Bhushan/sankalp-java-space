package SystemDesign.BehaviouralDesignPattern.VisitorPattern;

// Visitor interface declares visit methods for each type of element
public interface Visitor {
	int visit(Book book);

	int visit(Fruit fruit);
}