package Lists5.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingListsLab03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> mergedList = new ArrayList<>();

        int indexInList1 = 0;
        int indexInList2 = 0;
        while (indexInList1 < list1.size() || indexInList2 < list2.size()) {

            if (indexInList1 < list1.size()) {
                mergedList.add(list1.get(indexInList1));
                indexInList1++;
            }
            if (indexInList2 < list2.size()) {
                mergedList.add(list2.get(indexInList2));
                indexInList2++;
            }
        }
        for (Integer number : mergedList) {
            System.out.print(number + " ");

        }
    }
}
