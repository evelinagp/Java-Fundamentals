package AssociativeArrays7;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class JudgeME02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, TreeMap<String, Integer>> contestsUsersPoints = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("no more time")) {
            String[] tokens = input.split("\\s+->\\s+");
            String username = tokens[0];
            String contest = tokens[1];
            int points = Integer.parseInt(tokens[2]);

            if (!contestsUsersPoints.containsKey(contest)) {
                contestsUsersPoints.put(contest, new TreeMap<>());
                contestsUsersPoints.get(contest).put(username, points);
            } else {
                if (!contestsUsersPoints.get(contest).containsKey(username)) {
                    contestsUsersPoints.get(contest).put(username, points);
                } else {
                    contestsUsersPoints.get(contest).put(username, Math.max(points, contestsUsersPoints.get(username).get(contest)));
                }
            }
            //Also you need to keep individual statistics for each user - the total points of all constests.
            input = scanner.nextLine();
        }
        int i = 1;
        contestsUsersPoints.forEach((key, value) -> {
            System.out.println(key + ": " + key.length() + " participants");
            value.entrySet().stream().
                    sorted((f, s) -> s.getValue() - f.getValue()).
                    forEach(e -> System.out.printf("%d. %s <::> %d%n", i, e.getKey(), e.getValue()));
            System.out.println("Individual standings:");
            value.entrySet().stream().sorted((f, s) -> {
                int result = s.getValue().compareTo(f.getValue());
                return result;
            }).limit(2).forEach(e -> System.out.printf("%d. %s -> %d%n", i, e.getKey(), e.getValue()));
        });
    }
}

