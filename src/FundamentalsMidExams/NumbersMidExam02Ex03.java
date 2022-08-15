package FundamentalsMidExams;

import java.util.*;
import java.util.stream.Collectors;

public class NumbersMidExam02Ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> newList = new ArrayList<>();

        double totalValue = 0;
        int counter = 0;
        boolean is1number = false;
        if (list.size() == 1) {
            System.out.println("No");
            return;
        }
        for (Integer number : list) {
            totalValue += number;
            counter++;
        }
        double avrValue = totalValue / counter;
        for (Integer number : list) {
            if (number > avrValue) {
                newList.add(number);
            }
        }
            Collections.sort(newList);
            Collections.reverse(newList);
            for (int i = 0; i < newList.size(); i++) {
                if (i == 5){
                    break;
                }
                System.out.print(newList.get(i) + " ");
            }
        }
    }

