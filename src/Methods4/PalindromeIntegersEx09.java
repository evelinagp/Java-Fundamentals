package Methods4;

import java.util.Scanner;

public class PalindromeIntegersEx09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            int number = Integer.parseInt(input);
            if (isPalindrome(number)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }

    private static boolean isPalindrome(int number) {
        int originalNumber = number;
        int palindrome = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            palindrome = palindrome * 10 + lastDigit;
            number /= 10;
        }
        return originalNumber == palindrome;
    }
}
