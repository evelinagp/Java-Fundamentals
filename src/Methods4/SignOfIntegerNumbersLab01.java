package Methods4;

import java.util.Scanner;

public class SignOfIntegerNumbersLab01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        SignOfIntegerNumbers(num);
    }

    private static void SignOfIntegerNumbers(int number) {
        String sign = "zero";

        if (number > 0) {
            sign = "possitive";
        } else if (number < 0) {
            sign = "negative";
        }
        System.out.printf("The number %d is %s.", number, sign);
    }
}
