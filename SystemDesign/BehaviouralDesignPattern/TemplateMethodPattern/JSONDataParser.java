package SystemDesign.BehaviouralDesignPattern.TemplateMethodPattern;

public class JSONDataParser extends DataParser {

    @Override
    protected void readData() {
        System.out.println("Reading data from JSON file...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing JSON data: deserializing objects, checking structure...");
    }
}
