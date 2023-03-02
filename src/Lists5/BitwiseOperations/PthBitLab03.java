package Lists5.BitwiseOperations;

import java.util.Scanner;

public class PthBitLab03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        int bit = (n >> p) & 1;
        System.out.println(bit);
    }
}
