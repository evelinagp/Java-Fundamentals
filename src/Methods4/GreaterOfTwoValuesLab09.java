package Methods4;

import java.util.Scanner;

public class GreaterOfTwoValuesLab09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("int")) {
            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());
            int result = getMax(number1, number2);
            System.out.println(result);

        } else if (input.equals("char")) {
            char a = scanner.next().charAt(0);
            char b = scanner.next().charAt(0);
            char result = getMax(a, b);
            System.out.println(result);

        } else if (input.equals("string")) {
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            String result = getMax(first, second);
            System.out.println(result);
        }
    }

    private static String getMax(String first, String second) {

        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;

        }
    }

    private static int getMax(int number1, int number2) {
        return Math.max(number1, number2);
//        if (number1 > number2) {
//            return number1;
//        } else {
//            return number2;
    }

    private static char getMax(char a, char b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
