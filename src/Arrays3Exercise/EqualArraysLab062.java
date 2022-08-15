package Arrays3Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArraysLab062 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] first = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();

        int[] second = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();

        boolean areIdentical = true;
        int sum = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areIdentical = false;
                break;
            }else{
                sum += first [i];
            }
        }
        if (areIdentical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
