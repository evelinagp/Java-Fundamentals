package BasicSyntaxConditionalStatementsAndLoops1;

import java.util.Scanner;

public class TriangleOfNumbers082 {
            public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

            int counter = 1;
            for (int rows = 1; rows <= n; rows++) {
                for (int cols = 1; cols <= rows; cols++) {
                    System.out.printf("%d ", counter);
                }
                counter++;
                System.out.println();
            }
        }
    }

