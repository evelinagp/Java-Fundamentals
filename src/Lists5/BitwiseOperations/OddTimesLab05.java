package Lists5.BitwiseOperations;

import java.util.Arrays;
import java.util.Scanner;

public class OddTimesLab05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(element -> Integer.parseInt(element)).toArray();
        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result = result ^ numbers[i];
        }
        System.out.println(result);
        //example with first input:result=numbers[0]=1=001; result=010^001=011; result=011^011=000; 010^000=010; 011^010=001; 001^001=000; result=011^000=011=3;
    }
}