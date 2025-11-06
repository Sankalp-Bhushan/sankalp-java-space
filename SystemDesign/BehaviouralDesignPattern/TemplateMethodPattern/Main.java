package SystemDesign.BehaviouralDesignPattern.TemplateMethodPattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== CSV Data Parsing ===");
        DataParser csvParser = new CSVDataParser();
        csvParser.parseData();

        System.out.println("=== XML Data Parsing ===");
        DataParser xmlParser = new XMLDataParser();
        xmlParser.parseData();

        System.out.println("=== JSON Data Parsing ===");
        DataParser jsonParser = new JSONDataParser();
        jsonParser.parseData();
    }
}
