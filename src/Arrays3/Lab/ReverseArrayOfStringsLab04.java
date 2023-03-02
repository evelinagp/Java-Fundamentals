package Arrays3.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStringsLab04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
