package BasicSyntaxConditionalStatementsAndLoops1Exercise;

import java.util.Scanner;

public class StrongNumberEx06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
        int digit = input.charAt(i) - 48;
            int fact =1;
            for (int j = 1; j <=digit ; j++) {
                fact *=j;
            }
            sum += fact;
        }
        int inputNumber = Integer.parseInt(input);
        if (inputNumber == sum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
