package FinalExam;

import java.util.*;

public class Pr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> guestMeals = new TreeMap<>();

        String command = scanner.nextLine();
//        List<String> unlikeNames = new ArrayList<>();
        int unlikeCount = 0;
        while (!command.equals("Stop")) {
            String[] tokens = command.split("-");
            String commandName = tokens[0];
            String guest = tokens[1];
            String meal = tokens[2];
            switch (commandName) {
                case "Like":
                    if (!guestMeals.containsKey(guest)) {
                        guestMeals.put(guest, new ArrayList<>());
                        guestMeals.get(guest).add(meal);
                    } else if (!guestMeals.containsKey(meal)) {
                        guestMeals.get(guest).add(meal);
                    }
                    break;
                case "Unlike":

                    if (!guestMeals.containsKey(guest)) {
                        System.out.println(guest + " is not at the party.");
                    } else if (!guestMeals.get(guest).contains(meal)) {
                        System.out.printf("%s doesn't have the %s in his/her collection.%n", guest, meal);
                    } else {
                        List<String> currentMeals = guestMeals.get(guest);
                        System.out.printf("%s doesn't like the %s.%n", guest, meal);
                        unlikeCount++;
//                        unlikeNames.add(guest);
                        currentMeals.remove(meal);
                        guestMeals.put(guest, currentMeals);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        guestMeals.entrySet().stream().sorted((f, s) -> {
            int result = Integer.compare(s.getValue().size(), f.getValue().size());
            if (result == 0) {
                result = f.getKey().compareTo(s.getKey());
            }
            return result;
        }).forEach(e -> System.out.println(e.getKey() + ": " + String.join(", ", e.getValue())));
//        guestMeals.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
//                .forEach(e -> System.out.println(e.getKey() + ": " + String.join(", ", e.getValue())));
        System.out.printf("Unliked meals: %d%n", unlikeCount);
    }
}



