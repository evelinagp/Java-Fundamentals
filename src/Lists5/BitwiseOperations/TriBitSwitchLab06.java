package Lists5.BitwiseOperations;

import java.util.Scanner;

public class TriBitSwitchLab06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int position = Integer.parseInt(scanner.nextLine());

        int mask = 7 << position;// we need 111 at current position and int 7 = 111
        int result = number ^ mask;//1 ^ 1 = 0, 0 ^ 1 = 1
        System.out.println(result);
    }
}

