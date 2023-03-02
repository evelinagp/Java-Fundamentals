package Lists5.BitwiseOperations;

import java.util.Scanner;

public class BitDestroyerLab04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        int mask = ~(1 << p);
        int result = n & mask;
        System.out.println(result);
    }
}



