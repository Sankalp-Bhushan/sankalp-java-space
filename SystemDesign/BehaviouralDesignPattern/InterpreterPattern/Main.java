package SystemDesign.BehaviouralDesignPattern.InterpreterPattern;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        // (10 + 5) - (2 + 3)
        Expression expr1 = new AddExpression(new NumberExpression(10), new NumberExpression(5));
        Expression expr2 = new AddExpression(new NumberExpression(2), new NumberExpression(3));
        Expression mainExpr = new SubtractExpression(expr1, expr2);

        System.out.println("Expression: (10 + 5) - (2 + 3)");
        System.out.println("Result: " + mainExpr.interpret(context));

        // Another example: (100 - 20) + (10 + 5)
        Expression expr3 = new SubtractExpression(new NumberExpression(100), new NumberExpression(20));
        Expression expr4 = new AddExpression(new NumberExpression(10), new NumberExpression(5));
        Expression mainExpr2 = new AddExpression(expr3, expr4);

        System.out.println("\nExpression: (100 - 20) + (10 + 5)");
        System.out.println("Result: " + mainExpr2.interpret(context));
    }
}
