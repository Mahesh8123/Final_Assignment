package oops.com;

public class DataProcessor {

    public void processData(int[] data) throws InvalidDataException {
        if (data == null || data.length == 0) {
            throw new InvalidDataException("Data array is either null or empty.");
        }

        int sum = 0;
        for (int num : data) {
            sum += num;
        }

        double average = (double) sum / data.length;
        System.out.println("The average is: " + average);
    }
}

