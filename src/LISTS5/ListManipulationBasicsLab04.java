package LISTS5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasicsLab04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");
            if (command[0].equals("Add")) {
                int numberToAdd = Integer.parseInt(command[1]);
                list.add(numberToAdd);
            } else if (command[0].equals("Remove")) {
                int numberToRemove = Integer.parseInt(command[1]);
                list.remove(Integer.valueOf(numberToRemove));
            } else if (command[0].equals("RemoveAt")) {
                int indexToRemove = Integer.parseInt(command[1]);
                list.remove(indexToRemove);
            } else if (command[0].equals("Insert")) {
                int numberToInsert = Integer.parseInt(command[1]);
                int indexToInsert = Integer.parseInt(command[2]);
                list.add(indexToInsert, numberToInsert);
            }
            input = scanner.nextLine();
        }
        for (Integer number : list) {
            System.out.print(number + " ");
        }
    }
}
//Add {number}: add a number to the end of the list
//Remove {number}: remove a number from the list
//RemoveAt {index}: remove a number at a given index
//Insert {number} {index}: insert a number at a given index
//Note: All the indices will be valid!