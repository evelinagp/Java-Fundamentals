package Methods4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperationsLab11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int number2 = Integer.parseInt(scanner.nextLine());

        double result = calculate(number1, operator, number2);
        System.out.println (new DecimalFormat("0.####").format(result));
    }

    private static double calculate(int number1, String operator, int number2) {
        double result = 0.0;

        if (operator.equals("/")) {
            result += 1.0 * number1 / number2;
        } else if (operator.equals("*")) {
            result += number1 * number2;
        } else if (operator.equals("+")) {
            result += number1 + number2;
        } else if (operator.equals("-")) {
            result += number1 - number2;
        }
        return result;
    }
}
