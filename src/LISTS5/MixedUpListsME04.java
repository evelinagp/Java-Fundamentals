package LISTS5;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpListsME04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> list2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> newList = new ArrayList<>();

        List<Integer> reversedList2 = new ArrayList<>();

        List<Integer> remainingElements = new ArrayList<>();

        List<Integer> printingList = new ArrayList<>();


        for (int i = list2.size() - 1; i >= 0; i--) {
            reversedList2.add(list2.get(i));
        }

        if (list1.size() > list2.size()) {
            remainingElements.add(list1.get(list1.size() - 1));
            remainingElements.add(list1.get(list1.size() - 2));
            list1.remove(list1.size() - 1);
            list1.remove(list1.size() - 1);
        } else {
            remainingElements.add(reversedList2.get(list2.size() - 1));
            remainingElements.add(reversedList2.get(list2.size() - 2));
            reversedList2.remove(list2.size() - 1);
            reversedList2.remove(list2.size() - 2);
        }


        for (int j = 0; j < list1.size(); j++) {
            newList.add(list1.get(j));
            newList.add(reversedList2.get(j));
        }
        Collections.sort(remainingElements);
        Collections.sort(newList);
        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i) > remainingElements.get(0) && newList.get(i) < remainingElements.get(1) ) {
                    printingList.add(newList.get(i));
            }
        }
        for (Integer integer : printingList) {
            System.out.print(integer + " ");
        }
    }
}



