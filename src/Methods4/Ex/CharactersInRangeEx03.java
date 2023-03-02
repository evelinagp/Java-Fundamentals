package Methods4.Ex;

import java.util.Scanner;

public class CharactersInRangeEx03 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        if (first < second) {
            printCharactersInRange(first, second);
        }else{
            printCharactersInRange(second, first);
        }
    }

    private static void printCharactersInRange(char start, char end) {

        for (char i = ++ start ; i < end; i++) {
            System.out.printf("%c ", i);

        }
    }
}
