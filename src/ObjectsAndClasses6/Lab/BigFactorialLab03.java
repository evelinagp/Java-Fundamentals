package ObjectsAndClasses6.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorialLab03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //long -> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        BigInteger factorial = BigInteger.valueOf(1);

        for (int i = 1; i <= n; i++) {

            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}
   /* static BigInteger factorial(int n)
    {
        if ( n == 1 ) {
            return (BigInteger.valueOf(1));
        }
         }
}*/
