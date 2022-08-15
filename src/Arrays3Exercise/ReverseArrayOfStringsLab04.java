package Arrays3Exercise;

import java.util.Scanner;

public class ReverseArrayOfStringsLab04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");

        for (int i = 0; i < array.length; i++) {
        }
        for (int i = array.length; i > 0; i--) {
            System.out.print(array[i - 1] + " ");
        }
    }
}
