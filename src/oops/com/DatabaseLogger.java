package oops.com;

public class DatabaseLogger implements Logger {

    @Override
    public void logInfo(String message) {
        System.out.println("DatabaseLogger: INFO - " + message);
    }

    @Override
    public void logError(String message) {
        System.out.println("DatabaseLogger: ERROR - " + message);
    }

    // Optional: toString method to represent DatabaseLogger
    @Override
    public String toString() {
        return "DatabaseLogger instance";
    }
}
