package Arrays3Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArrayME012 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int stringsNumber = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[stringsNumber];
        for (int i = 0; i < stringsNumber; i++) {
            String name = scanner.nextLine();
            int length = name.length();
            int sum = 0;
            for (int j = 0; j < length; j++) {
                int letters = name.charAt(j);
                if (letters == 65 || letters == 69 || letters == 73 || letters == 79 || letters == 85
                        || letters == 97 || letters == 101 || letters == 105 || letters == 111 || letters == 117) {
                    letters *= length;
                } else {
                    letters /= length;
                }
                sum += letters;
            }
            numbers[i] = sum;
        }
//sort
        Arrays.sort(numbers);
//print
        for (int element : numbers) {
            System.out.println(element);
        }
    }
}










