package oops.com;

public class Main3 {
    public static void main(String[] args) {
        // Using FileLogger
        Logger fileLogger = new FileLogger();
        Application appWithFileLogger = new Application(fileLogger);
        appWithFileLogger.performApplicationTask();

        System.out.println(); // Blank line for separation

        // Using DatabaseLogger
        Logger databaseLogger = new DatabaseLogger();
        Application appWithDatabaseLogger = new Application(databaseLogger);
        appWithDatabaseLogger.performApplicationTask();
    }
}

