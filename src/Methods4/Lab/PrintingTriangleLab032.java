package Methods4.Lab;

import java.util.Scanner;

public class  PrintingTriangleLab032 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        printingTriangle(input);

    }

    private static void printingTriangle(int input) {
        printTopHalf(input);
        printBottomHalf(input);
    }

    private static void printTopHalf(int input) {
        for (int i = 1; i < input; i++) {
            printingLine(i);
        }
    }


    private static void printBottomHalf(int input) {
        for (int i = input; i >= 1; i--) {
            printingLine(i);
        }
    }

    private static void printingLine(int input) {
        for (int i = 1; i <= input; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
