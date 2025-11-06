package SystemDesign.StructuralDesignPatterns.BridgePattern;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(10, 20, 5, new RedCircle());
        Shape greenCircle = new Circle(30, 40, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
