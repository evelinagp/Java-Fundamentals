package Methods4;

import java.util.Scanner;

public class MultiplicationSignME05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        printType(num1, num2, num3);

        System.out.println(printType(num1, num2, num3));

    }

    private static String printType(int num1, int num2, int num3) {
        String type = " ";

        if (num1 == 0 || num2 == 0 || num3 == 0) {
            type += "zero";
        } else if (num1 < 0 && num2 < 0 && num3 < 0){
            type += "negative";
        } else if ((num1 < 0 && num2 > 0 && num3 > 0) || (num1 > 0 && num2 < 0 && num3 > 0) || (num1 > 0 && num2 > 0 && num3 < 0)  ){
            type += "negative";
        }else if (num1 > 0 && num2 > 0 && num3 > 0){
            type += "positive";
        } else if ((num1 < 0 && num2 < 0 && num3 > 0) || (num1 > 0 && num2 < 0 && num3 < 0) || (num1 < 0 && num2 > 0 && num3 < 0)  ) {
            type += "positive";
        }
            return type;
    }
}
//    You are given a number num1, num2 and num3. Write a program that finds if num1 * num2 * num3
//    (the product) is negative, positive or zero. Try to do this WITHOUT multiplying the 3 numbers.
