package SystemDesign.BehaviouralDesignPattern.ChainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {

        // Create loggers
        Logger infoLogger = new InfoLogger();
        Logger debugLogger = new DebugLogger();
        Logger errorLogger = new ErrorLogger();

        // Build the chain: INFO → DEBUG → ERROR
        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
        
        /*
        also can be written like this, if it is accepting next handler in the
        constructor itself
        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger()));
        */

        // Test logging at different levels
        infoLogger.logMessage(LogLevel.INFO, "Application started successfully.");
        infoLogger.logMessage(LogLevel.DEBUG, "Debugging configuration settings.");
        infoLogger.logMessage(LogLevel.ERROR, "Null pointer exception occurred!");
        infoLogger.logMessage(LogLevel.valueOf("ERROR"), "Database connection failed.");
    }
}
