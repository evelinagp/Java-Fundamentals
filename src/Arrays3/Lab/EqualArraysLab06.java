package Arrays3.Lab;

import java.util.Scanner;

public class EqualArraysLab06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstArrayAsString = scanner.nextLine();
        String[] firstNumbersStrings = firstArrayAsString.split(" ");
        int[] firstArray = new int[firstNumbersStrings.length];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = Integer.parseInt(firstNumbersStrings[i]);
        }
        String secondArrayAsString = scanner.nextLine();
        String[] secondNumbersStrings = secondArrayAsString.split(" ");
        int[] secondArray = new int[secondNumbersStrings.length];

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = Integer.parseInt(secondNumbersStrings[i]);
        }
        boolean areEqual = true;
        int differentAtIndex = -1;
        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    areEqual = false;
                    differentAtIndex = i;
                    break;
                }
            }
        } else {
            areEqual = false;
        }
        if (areEqual) {
            int sum = 0;
            for (int number:firstArray) {
                sum += number;
            }
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", differentAtIndex);
        }
    }
}
