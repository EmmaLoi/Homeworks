package HW2;

public class AverageOfNumbers {
    public static double getAverageOfArbitraryNumbers(double[] arbitraryNumbers) {
        double sum = 0;
        for (double number : arbitraryNumbers) {
            sum += number;
        }
        return sum / arbitraryNumbers.length;
    }
}