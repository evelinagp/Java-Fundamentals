package Methods4.Ex;

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
        //First way
        //int originalNumber = number;
        // int palindrome = 0;
        String originalNumber = String.valueOf(number);
        StringBuilder palindrome = new StringBuilder();
        while (number > 0) {
            int lastDigit = number % 10;
            palindrome.append(lastDigit);
            //   palindrome = palindrome * 10 + lastDigit;
            number /= 10;
        }
        return originalNumber.equals(palindrome.toString());
    }
}
