package SystemDesign.StructuralDesignPatterns.FacadePattern;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        System.out.println("=== Using Facade to draw shapes ===");
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
