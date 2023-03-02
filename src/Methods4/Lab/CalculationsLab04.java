package Methods4.Lab;

import java.util.Scanner;

public class CalculationsLab04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());


        if (command.equals("subtract")) {
            subtract(number1, number2);
        } else if ((command.equals("add"))) {
            add(number1, number2);
        } else if (command.equals("multiply")) {
            multiply(number1, number2);
        } else if (command.equals("divide")) {
            divide(number1, number2);
        }
    }

    private static void divide(int a, int b) {
        System.out.println(a / b);
    }

    private static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    private static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    private static void add(int a, int b) {
        System.out.println(a + b);
    }
}



