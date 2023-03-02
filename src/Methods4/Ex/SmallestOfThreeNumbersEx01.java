package Methods4.Ex;

import java.util.Scanner;

public class SmallestOfThreeNumbersEx01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        PrintSmallestOfThreeNumbers(first, second, third);

    }

    private static void PrintSmallestOfThreeNumbers(int a, int b, int c) {
        //First way
//        int smallest = a;
//        if (b < a && b < c) {
//            smallest = b;
//        }
//        if (c < b && c < a) {
//            smallest = c;
//        }
        int smallest = Math.min(a, Math.min(b, c));
        System.out.println(smallest);
    }
}

