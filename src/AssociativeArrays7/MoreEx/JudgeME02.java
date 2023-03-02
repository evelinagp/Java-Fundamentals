package AssociativeArrays7.MoreEx;

import java.util.*;
import java.util.stream.Collectors;

public class JudgeME02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, TreeMap<String, Integer>> contestsWithUsersAndTheirPoints = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("no more time")) {
            String[] tokens = input.split("\\s+->\\s+");
            String username = tokens[0];
            String contest = tokens[1];
            int points = Integer.parseInt(tokens[2]);

            if (!contestsWithUsersAndTheirPoints.containsKey(contest)) {
                contestsWithUsersAndTheirPoints.put(contest, new TreeMap<>());
                contestsWithUsersAndTheirPoints.get(contest).put(username, points);
            } else {
                if (!contestsWithUsersAndTheirPoints.get(contest).containsKey(username)) {
                    contestsWithUsersAndTheirPoints.get(contest).put(username, points);
                } else {
                    contestsWithUsersAndTheirPoints.get(contest).put(username, Math.max(points, contestsWithUsersAndTheirPoints.get(contest).get(username)));
                    // .put(username, Math.max(points, usersWithContestsAndTheirPoints.get(username)));
                }
            }
            input = scanner.nextLine();
        }
        contestsWithUsersAndTheirPoints.forEach((key, value) -> {
            final int[] index = {0};
            System.out.println(key + ": " + value.size() + " participants");
            value.entrySet().stream().
                    sorted((f, s) -> s.getValue() - f.getValue()).
                    forEach(e -> System.out.printf("%d. %s <::> %d%n", ++index[0], e.getKey(), e.getValue()));
        });
        System.out.println("Individual standings:");
        final int[] index = {0};
        contestsWithUsersAndTheirPoints.values()
                .stream()
                .flatMap(m -> m.entrySet().stream())
                .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.summingInt(Map.Entry::getValue)))
                .entrySet()
                .stream()
                .sorted((f, s) -> s.getValue().compareTo(f.getValue()))
                .forEach(participant -> {
                    System.out.printf("%d. %s -> %d%n", ++index[0], participant.getKey(), participant.getValue());
                });
    }
}



