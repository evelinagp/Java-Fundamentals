package Methods4;

import java.util.Scanner;

public class TopNumberEx10 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {

            if (sumIsDivisibleByEight(i) && hasOneOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean hasOneOddDigit(int number) {
        while (number > 0) {
            if ((number % 10) % 2 != 0)
                return true;
            number /= 10;
        }

        return false;
    }

    private static boolean sumIsDivisibleByEight(int number) {

        int digitSum = 0;
        while (number > 0) {
            digitSum += number % 10;
            number /= 10;
        }
//        if (digitSum % 8 == 0) {
//            return true;
//        } else {
//            return false;
            return digitSum % 8 == 0;
        }
    }
