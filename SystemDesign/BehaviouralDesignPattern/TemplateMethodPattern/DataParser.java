package SystemDesign.BehaviouralDesignPattern.TemplateMethodPattern;

public abstract class DataParser {

    // Template method - defines the skeleton
    public final void parseData() {
        readData();
        processData();
        saveData();
    }

    // Steps to be implemented by subclasses
    protected abstract void readData();
    protected abstract void processData();

    // Common step (shared by all)
    protected void saveData() {
        System.out.println("Saving processed data to database...\n");
    }
}
