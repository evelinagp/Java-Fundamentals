package Arrays3Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSumsEx062 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();

        if (numbers.length == 1) {
            System.out.println(0);
            return;
        }
        boolean isEquals = false;
        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
//            left sum
            for (int j = i - 1; j >= 0; j--) {
                leftSum += numbers[j];
            }
            //right sum
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }
            if (rightSum == leftSum) {
                System.out.println(i);
                isEquals = true;
                break;
            }
        }
        if (!isEquals)
            System.out.println("no");
    }
}
