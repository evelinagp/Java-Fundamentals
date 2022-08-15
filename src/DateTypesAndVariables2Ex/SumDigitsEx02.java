package DateTypesAndVariables2Ex;

import java.util.Scanner;

public class SumDigitsEx02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < input.length() ; i++) {
            int currentNum = (int)input.charAt(i)-48;
            sum += currentNum;
        }
        System.out.println(sum);
    }
}
