package Arrays3Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSumEx08 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();
        int sum = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < numbers.length-1; i++) {
            int firstNum = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int secondNum = numbers[j];

                if (firstNum + secondNum == sum) {
                    System.out.println(firstNum + " " + secondNum);
                }
            }
        }
    }
}



