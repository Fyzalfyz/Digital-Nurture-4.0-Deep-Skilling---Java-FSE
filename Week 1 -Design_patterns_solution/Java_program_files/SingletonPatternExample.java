package DesignPatterns;

public class SingletonPatternExample {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message");

        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton verified)");
        } else {
            System.out.println("Different instances (Singleton violated)");
        }
    }
}

class Logger {
    private static final Logger instance = new Logger();

    private Logger() {
        System.out.println("Logger Initialized (Eager)");
    }

    public static Logger getInstance() {
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
