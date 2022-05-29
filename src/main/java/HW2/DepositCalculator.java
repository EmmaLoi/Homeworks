package HW2;

public class DepositCalculator {

    public static void calc(double amount, int depositInYears, double annualPercentRate) {
        double primaryAmount = amount;
        int depositInMonths = depositInYears * 12;
        double rateInDouble = annualPercentRate / 100;
        double amountOfPercentInYear = 0;

        for (int i = 1; i <= depositInMonths; i++) {
            double sum = ((amount * rateInDouble) / 12);
            amount += sum;
            amountOfPercentInYear += sum;
            if (i % 12 == 0) {
                int countOfYears = i / 12;
                double accumulatedSumForYear = amountOfPercentInYear + primaryAmount;
                System.out.printf("Your percent for %s year is %.2f. Total amount is %.2f \n",
                        countOfYears,
                        amountOfPercentInYear,
                        accumulatedSumForYear
                );
                amountOfPercentInYear = 0;
            }
        }
        System.out.printf("Your total amount for is %.2f", amount);
    }
}