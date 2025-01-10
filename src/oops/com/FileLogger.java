package oops.com;

public class FileLogger implements Logger {

    @Override
    public void logInfo(String message) {
        System.out.println("FileLogger: INFO - " + message);
    }

    @Override
    public void logError(String message) {
        System.out.println("FileLogger: ERROR - " + message);
    }

    // Optional: toString method to represent FileLogger
    @Override
    public String toString() {
        return "FileLogger instance";
    }
}
