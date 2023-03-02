package DateTypesAndVariables2.Lab;

import java.util.Scanner;

public class LowerOrUpperLab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);
        if (symbol >= 65 && symbol<=90){
            System.out.println("upper-case");
        } else if (symbol >= 97 && symbol<=122){
            System.out.println("lower-case");
        }else {
            System.out.println("Please enter valid alphabetical symbol!");
        }
    }
}
