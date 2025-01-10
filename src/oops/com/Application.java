package oops.com;

public class Application {
    private Logger logger;  // Encapsulation: Logger is private

    // Constructor to inject the logger type (FileLogger or DatabaseLogger)
    public Application(Logger logger) {
        this.logger = logger;
    }

    public void performApplicationTask() {
        // Example task
        System.out.println("Performing application task...");
        
        // Log information
        logger.logInfo("Application task started.");
        
        // Simulate error and log
        logger.logError("An error occurred while performing the task.");
    }

    // Optional: toString method for Application class
    @Override
    public String toString() {
        return "Application using " + logger.toString();
    }
}
