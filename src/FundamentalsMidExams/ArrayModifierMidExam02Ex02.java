package FundamentalsMidExams;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifierMidExam02Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(element -> Integer.parseInt(element)).toArray();


        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] token = input.split("\\s+");
            String command = token[0];
            if (command.equals("swap")) {
                int index1 = Integer.parseInt(token[1]);
                int index2 = Integer.parseInt(token[2]);
                int oldNumbersI = numbers[index1];
                numbers[index1] = numbers[index2];
                numbers[index2] = oldNumbersI;
            } else if (command.equals("multiply")) {
                int index1 = Integer.parseInt(token[1]);
                int index2 = Integer.parseInt(token[2]);
                int product = numbers[index1] * numbers[index2];
                numbers[index1] = product;
            } else if (command.equals("decrease")) {
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] -= 1;
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numbers[numbers.length - 1]) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + "," + " ");
            }
        }
    }
}

