package BasicSyntaxConditionalStatementsAndLoops1Exercise;

import java.util.Scanner;

public class DivisionEx02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int max = 0;
        if (n % 2 == 0) {
            if (2 > max) {
                max = 2;
            }
        }
        if (n % 3 == 0) {
            if (3 > max) {
                max = 3;
            }
        }
        if (n % 6 == 0) {
            if (6 > max) {
                max = 6;
            }
        }
        if (n % 7 == 0) {
            if (7 > max) {
                max = 7;
            }
        }
        if (n % 10 == 0) {
            if (10 > max) {
                max = 10;
            }
        }
        if (n % 2 == 0 || n % 3 == 0 || n % 6 == 0 || n % 7 == 0 || n % 10 == 0) {
            System.out.printf("The number is divisible by %d", max);
        } else {
            System.out.println("Not divisible");
        }
    }
}