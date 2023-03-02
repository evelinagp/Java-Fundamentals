package Lists5.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TrainEx01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfWagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacityOfEachWagon = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();


        while (!input.equals("end")) {
            String[] command = input.split(" ");

            if (command[0].equals("Add")) {
                int passengers = Integer.parseInt(command[1]);
                listOfWagons.add(passengers);
            } else {
                int passengers = Integer.parseInt(command[0]);

                for (int i = 0; i < listOfWagons.size(); i++) {

                    if (listOfWagons.get(i) + passengers <= maxCapacityOfEachWagon) {
                        listOfWagons.set(i, listOfWagons.get(i) + passengers);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (Integer listOfWagon : listOfWagons) {
            System.out.print(listOfWagon + " ");
        }
    }
}


