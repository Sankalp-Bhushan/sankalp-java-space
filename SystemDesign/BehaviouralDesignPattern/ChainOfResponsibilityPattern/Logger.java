package SystemDesign.BehaviouralDesignPattern.ChainOfResponsibilityPattern;

public abstract class Logger {

    protected LogLevel level;
    protected Logger nextLogger;

    public Logger(LogLevel level) {
        this.level = level;
    }

    // Set next handler in the chain
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    // Core logic: either handle or forward
    public void logMessage(LogLevel level, String message) {
        if (this.level == level) {
            write(message);
        } else if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        } else {
            System.out.println("No logger found to handle level: " + level);
        }
    }

    // To be implemented by concrete classes
    protected abstract void write(String message);
}
