package SystemDesign.CreationalDesignPattern.AbstractFactoryPattern;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with Green color");
    }
}
