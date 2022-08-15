package TextProcessing8;

import jdk.swing.interop.SwingInterOpUtils;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumberEx05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 //        number1 * number2
        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());

        System.out.println(firstNumber.multiply(secondNumber));
    }
}
