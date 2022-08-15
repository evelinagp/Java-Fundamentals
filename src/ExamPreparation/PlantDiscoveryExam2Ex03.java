package ExamPreparation;


import java.util.*;

public class PlantDiscoveryExam2Ex03 {

    public static void main(String[] args) {

        Map<String, Integer> plantsRarityByName = new HashMap<>();
        Map<String, List<Integer>> plantsListOfRatingsByName = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] nameAndRarity = scanner.nextLine().split("<->");
            String plantName = nameAndRarity[0];
            int plantRarity = Integer.parseInt(nameAndRarity[1]);
            plantsRarityByName.put(plantName, plantRarity);
            plantsListOfRatingsByName.put(plantName, new ArrayList<>());
        }
        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String[] commandAndParameters = command.split(": ");
            String commandName = commandAndParameters[0];
            String[] parameters = commandAndParameters[1].split(" - ");
            String plantName = parameters[0];
            switch (commandName) {
                case "Rate":
                    int rating = Integer.parseInt(parameters[1]);
                    List<Integer> ratings = plantsListOfRatingsByName.get(plantName);
                    if (ratings != null) {
                        ratings.add(rating);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "Update":
                    int newRarity = Integer.parseInt(parameters[1]);
                    if (plantsRarityByName.containsKey(plantName)) {
                        plantsRarityByName.put(plantName, newRarity);
                    }
                    break;

                case "Reset":
                    List<Integer> resetRatings = plantsListOfRatingsByName.get(plantName);
                    if (resetRatings != null) {
                        resetRatings.clear();
                    } else {
                        System.out.println("error");
                    }
                    break;

                default:
                    System.out.println("error");

            }

            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantsRarityByName.entrySet().stream()
                .sorted((a, b) -> {
                    int aRarity = a.getValue();
                    int bRarity = b.getValue();

                    if (aRarity != bRarity) {
                        return Integer.compare(b.getValue(), a.getValue());
                    } else {
                        List<Integer> aRatingList = plantsListOfRatingsByName.get(a.getKey());
                        List<Integer> bRatingList = plantsListOfRatingsByName.get(b.getKey());
                        double aAverageRating = calculateAverage(aRatingList);
                        double bAverageRating = calculateAverage(bRatingList);

                        return Double.compare(bAverageRating, aAverageRating);
                    }
                }).map(entry ->String.format("- %s; Rarity: %d; Rating: %.2f",
                entry.getKey(), entry.getValue(),calculateAverage(plantsListOfRatingsByName.get(entry.getKey()))))
                .forEach(s -> System.out.println(s));

    }


    private static double calculateAverage(List<Integer> numbers) {
        double sum = 0;
        if (numbers.isEmpty()) {
            return 0;
        } else {
            for (Integer number : numbers) {
                sum += number;
            }
            return sum / numbers.size();
        }
    }
}

