package Arrays3.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegerEx053 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();

        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            if (i == numbers.length - 1) {
                System.out.print(currentNumber);
                break;
            }
            boolean isBigger = false;
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if ( currentNumber> numbers[j]){
                    isBigger = true;
                }else{
                    isBigger = false;
                    break;
                }
            }
            if (isBigger){
                System.out.print(currentNumber + " ");
            }
        }
    }
}
