package oops.com;

public class Main4{
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();

        // Valid input
        try {
            processor.processData(new int[]{1, 2, 3, 4, 5});
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }

        // Invalid input (empty array)
        try {
            processor.processData(new int[]{});
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }

        // Invalid input (null array)
        try {
            processor.processData(null);
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
