package LISTS5;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverseLab072 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> allNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List <Integer> nonNegativeNumbers = new ArrayList<>();

        for (int i = 0; i < allNumbers.size(); i++) {

            if (allNumbers.get(i) >= 0) {
                nonNegativeNumbers.add(allNumbers.get(i));
            }
        }
        if (nonNegativeNumbers.size() == 0) {
            System.out.println("empty");
        } else {
            Collections.reverse(nonNegativeNumbers);
            for (Integer nonNegativeNumber : nonNegativeNumbers) {
                System.out.print(nonNegativeNumber + " ");
            }
        }
    }
}
