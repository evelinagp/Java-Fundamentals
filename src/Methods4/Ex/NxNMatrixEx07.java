package Methods4.Ex;

import java.util.Scanner;

public class NxNMatrixEx07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printNxNMatrix(n);
    }

    private static void printNxNMatrix(int n) {

        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
