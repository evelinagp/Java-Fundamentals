package Methods4.MoreEx;

import java.util.Scanner;

public class DataTypesME012 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String input2 = scanner.nextLine();


        if (input.equals("string")) {
            String result = printString(input2);
            System.out.println(result);
        } else if (input.equals("int")) {
            int result = printInt(input2);
            System.out.println(result);
        } else if (input.equals("real")) {
            double result = printDouble(input2);
            System.out.printf("%.2f", result);
        }
    }

    private static double printDouble( String input2) {
        double number = Double.parseDouble(input2);
        return (1.5 * number);
    }

    private static int printInt(String input2) {
        int number = Integer.parseInt(input2);
        return (number * 2);
    }

    private static String printString(String input2) {
        return ("$" + input2 + "$");
    }
}
