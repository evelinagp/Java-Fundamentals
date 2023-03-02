package Methods4.Ex;

import java.util.Scanner;

public class AddAndSubtractEx05 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int result = getResult(first, second, third);
        System.out.println(result);
    }

    private static int getResult(int first, int second, int third) {

        return (first + second) - third;
    }
}
