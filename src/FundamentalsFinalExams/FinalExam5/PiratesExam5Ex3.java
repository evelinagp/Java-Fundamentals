package FundamentalsFinalExams.FinalExam5;

import java.util.*;

public class PiratesExam5Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        Map<String, List<Integer>> cities = new LinkedHashMap<>();

        while (!userInput.equals("Sail")) {
            String[] cityData = userInput.split("\\|\\|");
            String cityName = cityData[0];
            int population = Integer.parseInt(cityData[1]);
            int gold = Integer.parseInt(cityData[2]);
            if (cities.containsKey(cityName)) {
                List<Integer> currentCityData = cities.get(cityName);
                int currentCityPopulation = currentCityData.get(0);
                int currentCityGold = currentCityData.get(1);
                currentCityData.set(0, currentCityPopulation + population);
                currentCityData.set(1, currentCityGold + gold);
                cities.put(cityName, currentCityData);
            } else {
                cities.put(cityName, Arrays.asList(population, gold));
            }
            userInput = scanner.nextLine();
        }
        userInput = scanner.nextLine();
        while (!userInput.equals("End")) {
            String[] command = userInput.split("=>");
            String commandName = command[0];
            String cityName = command[1];
            if (commandName.equals("Plunder")) {
                int peopleKilled = Integer.parseInt(command[2]);
                int goldStolen = Integer.parseInt(command[3]);

                int peopleBeforePlunder = cities.get(cityName).get(0);
                int goldBeforePlunder = cities.get(cityName).get(1);

                int remainingPeople = peopleBeforePlunder - peopleKilled;
                int remainingGold = goldBeforePlunder - goldStolen;


                if (remainingGold <= 0 || remainingPeople <= 0) {
                    if (remainingGold <= 0) {
                        goldStolen = goldBeforePlunder;
                    }
                    if (remainingPeople <= 0) {
                        peopleKilled = peopleBeforePlunder;
                    }
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", cityName, goldStolen, peopleKilled);
                    System.out.printf("%s has been wiped off the map!%n", cityName);
                    cities.remove(cityName);

                }else{

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", cityName, goldStolen, peopleKilled);
                    cities.put(cityName, Arrays.asList(remainingPeople, remainingGold));
                }

            } else if (commandName.equals("Prosper")) {
                int goldProsper = Integer.parseInt(command[2]);
                if (goldProsper < 0) {
                    System.out.println("Gold added cannot be a negative number!");

                }else{

                int goldBeforeProsper = cities.get(cityName).get(1);
                int goldAfterProsper = goldBeforeProsper + goldProsper;
                cities.get(cityName).set(1, goldAfterProsper);
                System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", goldProsper, cityName, goldAfterProsper);
                }
            }
            userInput = scanner.nextLine();
        }
        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cities.size());
        cities.entrySet().

                stream().

//                sorted((left, right) ->
//
//                {
//                    int result = right.getValue().get(1).compareTo(left.getValue().get(1));
//                    if (result == 0) {
//                        result = left.getKey().compareTo(right.getKey());
//                    }
//                    return result;
//                }).

                forEach(entry -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                        entry.getKey(), entry.getValue().

                                get(0), entry.

                                getValue().

                                get(1)));
    }
}

