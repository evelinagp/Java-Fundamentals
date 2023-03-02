package Arrays3.MoreEx;

import java.util.Scanner;

public class EncryptSortAndPrintArrayME01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int stringsNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < stringsNumber; i++) {
            String array = scanner.nextLine();
            int length = array.length();


            int sum = 0;
            for (int j = 0; j < length; j++) {
                int letters = array.charAt(j);
                if (letters == 65 || letters == 69 || letters == 73 || letters == 79 || letters == 85 || letters == 97 || letters == 101 || letters == 105 || letters == 111 || letters == 117) {
                    letters *= length;
                } else {
                    letters /= length;
                }
                sum += letters;
            }

            System.out.println(sum);
        }
    }
}
