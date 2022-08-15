package Methods4;

import java.util.Scanner;

public class MultiplyEvensByOddsLab10 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        getMultipleOfEvensAndOdds(number);
        System.out.println(getMultipleOfEvensAndOdds(number));
    }

    private static int getMultipleOfEvensAndOdds(int number) {
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);
        return Math.abs(evenSum * oddSum);
    }

    private static int getSumOfEvenDigits(int number) {
        int evenSum = 0;
        for (int j = Math.abs(number); j > 0; j /= 10) {
            int lastNumber = j % 10;
            if (lastNumber % 2 == 0) {
                evenSum += lastNumber;
            }
        }
        return evenSum;
    }

    private static int getSumOfOddDigits(int number) {
        int oddSum = 0;

        for (int i = Math.abs(number); i > 0; i /= 10) {
            int lastNumber = i % 10;
            if (lastNumber % 2 != 0) {
                oddSum += lastNumber;
            }
        }
        return oddSum;
    }
}
