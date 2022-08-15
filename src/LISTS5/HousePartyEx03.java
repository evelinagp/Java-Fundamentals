package LISTS5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HousePartyEx03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> list = new ArrayList<>();
        while (n > 0) {
            String[] command = scanner.nextLine().split(" ");
            String name = command[0];
            if (command[2].equals("going!")) {
                if (list.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    list.add(name);
                }
            } else {
                if (list.contains(name)) {
                    list.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
            n--;
        }
        for (String name : list) {
            System.out.println(name);
        }
    }
}
