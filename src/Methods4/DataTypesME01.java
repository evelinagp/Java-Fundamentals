package Methods4;

import java.util.Scanner;

public class DataTypesME01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String input2 = scanner.nextLine();

       if (input.equals("int")) {
            int number = Integer.parseInt(input2);
            System.out.println(number * 2);
        } else if (input.equals("real")) {
            double number = Double.parseDouble(input2);
            System.out.printf("%.2f", 1.5 * number);

        } else if (input.equals("string")) {
            System.out.println("$" + input2 + "$");
        }
    }
}
