package Lists5.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGameEx06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!(firstPlayer.isEmpty() || secondPlayer.isEmpty())) {
            int first = firstPlayer.get(0);
            int second = secondPlayer.get(0);
            if (first == second) {
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            } else if (first > second) {
                firstPlayer.add(first);
                firstPlayer.add(second);
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            } else {
                firstPlayer.remove(0);
                secondPlayer.remove(0);
                secondPlayer.add(second);
                secondPlayer.add(first);
            }
        }
        int sum = 0;
        if (!firstPlayer.isEmpty()) {
            for (Integer number : firstPlayer) {
                sum += number;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (Integer number : secondPlayer) {
                sum += number;
            }
            System.out.printf("Second player wins! Sum: %d", sum);

        }
    }
}


