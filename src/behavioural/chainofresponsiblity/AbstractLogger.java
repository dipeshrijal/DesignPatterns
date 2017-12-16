package behavioural.chainofresponsiblity;

public abstract class AbstractLogger {
    public static int INFO;
    public static int DEBUG;
    public static int ERROR;

    static {
        ERROR = 3;
        DEBUG = 2;
        INFO = 1;
    }

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }

        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
