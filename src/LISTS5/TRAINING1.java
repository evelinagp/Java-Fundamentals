package LISTS5;

import java.util.ArrayList;
import java.util.Scanner;

public class TRAINING1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        int number = scanner.nextInt();
        while (number != 0) {
            numbers.add(number);
            number = scanner.nextInt();
        }
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
