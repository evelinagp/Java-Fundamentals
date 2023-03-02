package Lists5.MoreEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TakeOrSkipRopeME03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        List<Character> digitList = new ArrayList<>();
        List<Character> stringList = new ArrayList<>();

        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();


        for (int i = 0; i < input.length(); i++) {
            int symbol = input.charAt(i);
            if (symbol >= 48 && symbol <= 57) {
                digitList.add((char) symbol);
            } else {
                stringList.add((char) symbol);
            }
        }
        for (int i = 0; i < digitList.size(); i++) {
            int numToAdd = Character.getNumericValue(digitList.get(i));
            if (i % 2 == 0) {
                takeList.add(numToAdd);
            } else {
                skipList.add(numToAdd);
            }
        }
        String result = "";

        int total = 0;
        for (int index = 0; index < skipList.size(); index++) {
            int skipCount = skipList.get(index);
            int takeCount = takeList.get(index);
//            result += new String(stringList.stream().skip(total).(takeCount).ToArray();
//            total += skipCount + takeCount;
        }
        System.out.println(result);
    }
}



