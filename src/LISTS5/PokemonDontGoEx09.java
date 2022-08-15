package LISTS5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGoEx09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        int temp = 0;
        while (list.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index <= list.size() - 1) {
                temp += list.get(index);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get((i)) <= temp) {
                        list.set(i, list.get(i) + temp);
                    } else {
                        list.set(i, list.get(i) - temp);
                    }
                }
                sum += temp;
                list.remove(index);
                temp = 0;
            } else {
                if (index < 0) {
                    index = 0;
                    temp += list.get(index);
                    list.set(index, list.get(list.size() - 1));
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get((i)) <= temp) {
                            list.set(i, list.get(i) + temp);
                        } else {
                            list.set(i, list.get(i) - temp);
                        }
                    }
                    sum += temp;
                    temp = 0;
                } else if (index > list.size() - 1) {
                    index = list.size() - 1;
                    temp += list.get(index);
                    list.set(index, list.get(0));
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get((i)) <= temp) {
                            list.set(i, list.get(i) + temp);
                        } else {
                            list.set(i, list.get(i) - temp);
                        }
                    }
                    sum += temp;
                    temp = 0;
                }
            }
        }
        System.out.println(sum);
    }
}




