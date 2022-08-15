package Methods4;

import java.math.BigInteger;
import java.util.Scanner;

public class TribonacciSequenceME04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger[] result = GetTribonacciNumbers(n);

        for (BigInteger bigInteger : result) {
            System.out.print(bigInteger + " ");
        }
    }


    private static BigInteger[] GetTribonacciNumbers(int n) {
        BigInteger[] result = new BigInteger[n];

        switch (n) {
            case 1:
                result[0] = BigInteger.valueOf(1);
                break;
            case 2:
                result[0] = BigInteger.valueOf(1);
                result[1] = BigInteger.valueOf(1);
                break;
            case 3:
                result[0] = BigInteger.valueOf(1);
                result[1] = BigInteger.valueOf(1);
                result[2] = BigInteger.valueOf(2);
                break;
            default:
                result[0] = BigInteger.valueOf(1);
                result[1] = BigInteger.valueOf(1);
                result[2] = BigInteger.valueOf(2);
                for (int i = 3; i < n; i++) {
                    BigInteger currNum = result[i - 3].add(result[i - 2]).add(result[i - 1]);
                    result[i] = currNum;
                }
                break;
        }
        return result;
    }
}
