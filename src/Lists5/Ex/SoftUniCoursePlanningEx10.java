package Lists5.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanningEx10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] command = input.split(":");
            String lessonTitle = command[1];
            switch (command[0]) {
                case "Add":
                    if (!list.contains(lessonTitle)) {
                        list.add(lessonTitle);
                    }
                    break;

                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    if (!list.contains(lessonTitle)) {
                        list.add(index, lessonTitle);
                    }
                    break;

                case "Remove":
                    if (list.contains(lessonTitle)) {
                        list.remove(lessonTitle);
                        if (list.contains(command[1] + "-Exercise")) {
                            list.remove(command[1] + "-Exercise");
                        }
                    }
                    break;

                case "Swap":
                    String lessonTitle2 = command[2];
                        int indexTitle1 = list.indexOf(lessonTitle);
                        int indexTitle2 = list.indexOf(lessonTitle2);
                    if (list.contains(lessonTitle) && list.contains(lessonTitle2)) {
                        list.set(indexTitle1, lessonTitle2);
                        list.set(indexTitle2, lessonTitle);
                    }
                    if (list.contains(command[1] + "-Exercise")) {
                        list.remove(command[1] + "-Exercise");
                        list.add((list.indexOf(lessonTitle)+ 1), command[1] + "-Exercise");

                    }
                    if (list.contains(command[2] + "-Exercise")) {
                        list.remove(command[2] + "-Exercise");
                        list.add((list.indexOf(command[2]) + 1), command[2] + "-Exercise");
                    }

                    break;

                case "Exercise":
                    String ex1 = command[1] + "-Exercise";
                    if (!list.contains(lessonTitle) && !list.contains(ex1)) {
                        list.add(lessonTitle);
                        list.add(ex1);
                    } else if (list.contains(lessonTitle) && !list.contains(ex1)) {
                        int indexTitle = list.indexOf(lessonTitle);
                        list.add(indexTitle + 1, ex1);

                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (
                int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + "." + list.get(i));
        }
    }
}
