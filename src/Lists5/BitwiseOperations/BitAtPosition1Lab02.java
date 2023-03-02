package Lists5.BitwiseOperations;

import java.util.Scanner;

public class BitAtPosition1Lab02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

//        StringBuilder sb = new StringBuilder();
//
//        while (n > 0) {
//            int reminder = n % 2;
//            sb.append(reminder);
//            n /= 2;
//        }
//        String substring = sb.substring(1, 2);
//        System.out.println(substring);
        int bit = (n >> 1) & 1;
        System.out.println(bit);
    }
}

