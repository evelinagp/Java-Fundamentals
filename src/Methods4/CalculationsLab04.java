package Methods4;

import java.util.Scanner;

public class CalculationsLab04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());


        if (command.equals("subtract")) {
            subtract(width, height);
        } else if ((command.equals("add"))) {
            add(width, height);
        } else if (command.equals("multiply")) {
            multiply(width, height);
        } else if (command.equals("divide")) {
            divide(width, height);
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



