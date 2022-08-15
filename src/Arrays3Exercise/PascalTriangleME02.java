package Arrays3Exercise;

import java.util.Scanner;

public class PascalTriangleME02 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        if (n >= 1 && n <= 60) {

            for (int rows = 0; rows < n; rows++) {
                int number = 1;
                for (int cols = 0; cols <= rows; cols++) {

                    System.out.print(number + " ");
                    number = number * (rows - cols) / (cols + 1);
                }
                System.out.println();
            }
        }
    }
}
