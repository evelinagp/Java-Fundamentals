package AssociativeArrays7;

import java.util.*;

public class ForceBookEx09NO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> uniqueForceUser = new TreeMap<>();

        String input = scanner.nextLine();


        while (!input.equals("Lumpawaroo")) {
            String[] command;
            String operand = "";

            if (input.contains("|")) {
                command = input.split("\\s+\\|\\s+");
                operand = "|";
            } else {
                command = input.split("\\s+->\\s+");
                operand = "->";
            }

            if ("|".equals(operand)) {
                String forceSide = command[0];
                String forceUser = command[1];

                boolean check = false;

                for (Map.Entry<String, List<String>> current : uniqueForceUser.entrySet()) {
                    if (current.getValue().contains(forceUser)) {
                        check = true;
                        break;
                    }
                }
                if (!uniqueForceUser.containsKey(forceSide)) {
                    uniqueForceUser.put(forceSide, new ArrayList<>());
                    uniqueForceUser.get(forceSide).add(forceUser);
                } else if (uniqueForceUser.containsKey(forceSide) && !uniqueForceUser.get(forceSide).contains(forceUser)) {
                    uniqueForceUser.get(forceSide).add(forceUser);
                }
            } else {
                String user = command[0];
                String whichSide = command[1];
                for (Map.Entry<String, List<String>> current : uniqueForceUser.entrySet()) {
                    if (current.getValue().contains(user)) {
                        uniqueForceUser.get(current.getKey()).remove(user);
                        break;
                    }
                }

                if (!uniqueForceUser.containsKey(whichSide)) {
                    uniqueForceUser.put(whichSide, new ArrayList<>());
                    uniqueForceUser.get(whichSide).add(user);
                    System.out.printf("%s joins the %s side!%n", user, whichSide);
                } else if (uniqueForceUser.containsKey(whichSide) && !uniqueForceUser.get(whichSide).contains(user)) {
                    uniqueForceUser.get(whichSide).add(user);
                    System.out.printf("%s joins the %s side!%n", user, whichSide);
                }
            }

            input = scanner.nextLine();
        }

        uniqueForceUser.entrySet().stream().filter(users -> users.getValue().size() > 0)
                .sorted(Map.Entry. <String, List<String>> comparingByValue(Comparator.comparing(List::size)).reversed())
                .forEach(s -> {
                    System.out.printf("Side: %s, Members: %d%n ", s.getKey(), s.getValue().size());

                    s.getValue().stream().sorted(String::compareTo).forEach(person -> System.out.printf("! %s%n",person));
                });

    }
}

