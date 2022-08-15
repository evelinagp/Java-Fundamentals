package LISTS5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrickLab02 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

//  Gauss' Trick
//Write a program that sum all numbers in a list in the following order:
//first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.
        for (int i = 0; i < numbers.size() / 2; i++) {

            numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - i - 1));
            numbers.remove(numbers.size()- i - 1);
        }
        if (numbers.size() % 2 != 0) {
            for (int i = 0; i <= numbers.size() / 2; i++) {
                System.out.print(numbers.get(i) + " ");
            }
        } else {
            for (int i = 0; i < numbers.size() / 2; i++) {
                System.out.print(numbers.get(i) + " ");
            }
        }
    }
}


//        Scanner scanner = new Scanner(System.in);
//        String[] input = scanner.nextLine().split(" ");
//
//        for (int i = 0; i < input.length / 2; i++) {
//            String temp = input[i];
//            input[i] = input[input.length - i - 1];
//            input[input.length - i - 1] = temp;
//
//        }
//        System.out.println(String.join(" ", input));
//    }
//}