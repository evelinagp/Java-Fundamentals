package LISTS5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MessagingME01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String message = scanner.nextLine();

        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            int index = CalculateIndex(currentNumber);

            char currentChar = GetCharFromMessage(index, message);
            System.out.print(currentChar);

            int realIndex = CalculateRealIndex(index, message);
            List<String> newMessage = Arrays.stream(message.split("\\s+")).collect(Collectors.toList());
//            String newMessage = message.Remove(realIndex, 1);
//            message = newMessage;
        }

        System.out.println();
    }

    public static int CalculateIndex(int number) {
        int index = 0;
        while (number > 0) {
            int currentNumber = number % 10;
            index += currentNumber;
            number /= 10;
        }

        return index;
    }

    public static char GetCharFromMessage(int index, String message) {
        int countIndex = 0; // Като стане 27 да го спрем?

        for (int i = 0; i < index; i++) // int i = 0; i <= index; i++
             {
            countIndex++;

            if (countIndex == message.length()) {
                countIndex = 0;
            }
        }

        char currentChar = message.charAt(countIndex);
        return currentChar;
    }

    static int CalculateRealIndex(int index, String message) {
        int countIndex = 0;

        for (int i = 0; i < index; i++) {
            countIndex++;

            if (countIndex == message.length()) {
                countIndex = 0;
            }
        }
        return countIndex;
    }
}

