package FundamentalsFinalExams.FinalExam2;

import java.util.Scanner;

public class WorldTourExam2Ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder initialDestination = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Travel")) {

            String[] command = input.split(":");
            if (command[0].equals("Add Stop")) {
                int addStopIndex = Integer.parseInt(command[1]);
                String stopToInsert = command[2];
                if (addStopIndex >= 0 && addStopIndex < initialDestination.length()) {
                    initialDestination.insert(addStopIndex, stopToInsert);
                }
            } else if (command[0].equals("Remove Stop")) {
                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);
                if ((startIndex >= 0 && startIndex < initialDestination.length()) && endIndex >= 0 && endIndex < initialDestination.length()) {
                    initialDestination.delete(startIndex, endIndex + 1);
                }
            } else if (command[0].equals("Switch")) {
                String oldString = command[1];
                String newString = command[2];
//                while (initialDestination.indexOf(oldString) != -1) {
//                    int beginIndexNew = initialDestination.indexOf(oldString);
//                    int endIndexNew = beginIndexNew + oldString.length();
//                    initialDestination.replace(beginIndexNew, endIndexNew, newString);
                String destinationAsString = initialDestination.toString();
                destinationAsString = destinationAsString.replace(oldString, newString);
                initialDestination = new StringBuilder(destinationAsString);
            }
            System.out.println(initialDestination);
            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s",initialDestination );
    }
}


