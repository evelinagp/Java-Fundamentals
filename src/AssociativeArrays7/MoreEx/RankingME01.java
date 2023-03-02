package AssociativeArrays7.MoreEx;

import java.util.*;

public class RankingME01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contests = new HashMap<>();
        Map<String, HashMap<String, Integer>> users = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end of contests")) {
            String[] tokens = input.split(":");
            String contest = tokens[0];
            String password = tokens[1];

            if (!contests.containsKey(contest)) {
                contests.put(contest, password);
            } else {
                contests.put(contest, password);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("end of submissions")) {
            String[] tokens = input.split("=>");
            String contest = tokens[0];
            String password = tokens[1];
            String userName = tokens[2];
            int userPoints = Integer.parseInt(tokens[3]);

            if (contests.containsKey(contest)) {
                if (contests.get(contest).equals(password)) {

                    HashMap<String, Integer> course = new HashMap<>();
                    course.put(contest, userPoints);

                    if (!users.containsKey(userName)) {
                        users.put(userName, course);
                    } else {
                        if (!users.get(userName).containsKey(contest)) {
                            users.get(userName).put(contest, userPoints);
                        } else {
                            users.get(userName).put(contest, Math.max(userPoints, users.get(userName).get(contest)));
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        int totalSum = 0;
        for (Map.Entry<String, HashMap<String, Integer>> user : users.entrySet()) {
            int sum = user.getValue().values().stream().mapToInt(i -> i).sum();
            if (sum > totalSum) {
                totalSum = sum;
            }
        }

        for (Map.Entry<String, HashMap<String, Integer>> user : users.entrySet()) {
            if (user.getValue().values().stream().mapToInt(i -> i).sum() == totalSum) {
                System.out.printf("Best candidate is %s with total %d points.%n", user.getKey(), totalSum);
            }
        }

        System.out.println("Ranking:");
        users.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.entrySet().stream().
                    sorted((f, s) -> s.getValue() - f.getValue()).
                    forEach(i -> System.out.printf("#  %s -> %d%n", i.getKey(), i.getValue()));
        });
    }
}
