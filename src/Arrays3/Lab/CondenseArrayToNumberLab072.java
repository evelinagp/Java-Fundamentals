package Arrays3.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumberLab072 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] originalArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();
        int finalResult = 0;
        int firstLength = originalArray.length - 1;

        while (firstLength + 1 > 1) {
            for (int i = 0; i < firstLength; i++) {
                int[] modifiedArray = new int[originalArray.length - 1];
                for (int j = 0; j < modifiedArray.length; j++)
                    modifiedArray[j] = originalArray[j] + originalArray[j + 1];
                originalArray = modifiedArray;
                finalResult = modifiedArray[0];
                firstLength--;
            }
        }
        if (firstLength <= 1) {
            System.out.println(originalArray[0]);
        } else {
            System.out.println(finalResult);
        }
    }
}
