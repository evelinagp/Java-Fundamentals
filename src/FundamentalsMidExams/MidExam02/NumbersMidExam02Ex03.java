package FundamentalsMidExams.MidExam02;

import java.util.*;
import java.util.stream.Collectors;

public class NumbersMidExam02Ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> newList = new ArrayList<>();

        double totalValue = 0;

        if (list.size() == 1) {
            System.out.println("No");
            return;
        }
        for (Integer number : list) {
            totalValue += number;

        }
        double avrValue = totalValue / list.size();
        for (Integer number : list) {
            if (number > avrValue) {
                newList.add(number);
            }
        }
        Collections.sort(newList);
        Collections.reverse(newList);
        newList.stream().limit(5).forEach(e -> System.out.print(e + " "));

    }
}

