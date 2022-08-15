package LISTS5;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverseLab07 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        boolean isEmpty = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                isEmpty = true;
                break;
            } else {
                list.removeIf(n -> n < 0);
            }
        }
        Collections.reverse(list);
        if (isEmpty) {
            System.out.println("empty");
        } else {
            for (int number : list) {
                System.out.print(number + " ");
            }
        }
    }
}

