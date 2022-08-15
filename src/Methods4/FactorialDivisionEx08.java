package Methods4;

import java.util.Scanner;

public class FactorialDivisionEx08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        double result = calculateFactorial(number1) * 1.0 / calculateFactorial(number2);
        System.out.printf("%.2f", result);
    }

    private static long calculateFactorial(long number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
