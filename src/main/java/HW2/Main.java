package HW2;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(AverageOfTwoNumbers.getAverageOfTwoNumbers(7, 7.6));
        System.out.println(AverageOfNumbers.getAverageOfArbitraryNumbers(new double[]{7, 12, 0, 5.5}));

        System.out.println("Enter primary amount: ");
        double amount = sc.nextDouble();
        System.out.println("Enter term of your deposit(in years): ");
        int depositYears = sc.nextInt();
        System.out.println("Enter percent in year: ");
        double annualPercentYear = sc.nextDouble();

        DepositCalculator.calc(amount, depositYears, annualPercentYear);
    }
}