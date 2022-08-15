package Arrays3Exercise;

import java.util.Scanner;

public class RecursiveFibonacciME03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int elementsNumber = Integer.parseInt(scanner.nextLine());

        if (elementsNumber >= 0 && elementsNumber <= 50) {
            long first = 0;
            long second = 1;
            long third = second + first;
            for (int i = 0; i < elementsNumber; i++) {
                first = second;
                second = third;
                third = first + second;
            }
            System.out.println(first);
        }
    }
}