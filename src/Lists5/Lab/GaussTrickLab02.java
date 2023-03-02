package Lists5.Lab;

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
//first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.  //   if (numbers.size() % 2 != 0) {
        for (int i = 0; i < numbers.size() / 2 + 1; i++) {

            numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
            numbers.remove(numbers.size() - 1);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

    }
}
