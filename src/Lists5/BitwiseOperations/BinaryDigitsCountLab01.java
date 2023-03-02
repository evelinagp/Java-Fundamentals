package Lists5.BitwiseOperations;

import java.util.Scanner;

public class BinaryDigitsCountLab01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int binaryNumber = Integer.parseInt(scanner.nextLine());

        int count = 0;
        while (n > 0) {
            int reminder = n % 2;
            if (reminder == binaryNumber) {
                count++;
            }
            n /= 2;
        }
        System.out.println(count);
    }
}
