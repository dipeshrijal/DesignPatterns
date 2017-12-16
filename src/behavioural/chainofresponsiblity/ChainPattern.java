package behavioural.chainofresponsiblity;

public class ChainPattern {
    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);


        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);


        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is info message");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is debug message");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is error message");
    }
}
