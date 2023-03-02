package RegularExpressions9.Ex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RaceEx02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Regex
        String regexName = "[A-Za-z]+";
        String regexDistance = "[0-9]";
        Pattern patternName = Pattern.compile(regexName);
        Pattern patternDistance = Pattern.compile(regexDistance);
//    George, Peter, Bill, Tom
        List<String> racers = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        Map<String, Integer> racersDistances = new LinkedHashMap<>();
//        име и разстояние
        racers.forEach(racer -> racersDistances.put(racer, 0));


        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
//           G4e@55or%6g6!68e!!@
//           всички букви -> име на състезателя
//           всички цифри -> дистанция на състезателя
            Matcher matcherName = patternName.matcher(input);
            String name = "";
            while (matcherName.find()) {
                name += matcherName.group();
            }
            int distance = 0;
            Matcher matcherDistance = patternDistance.matcher(input);
            while (matcherDistance.find()) {
                distance += Integer.parseInt(matcherDistance.group());
            }
            if (racersDistances.containsKey(name)) {
                racersDistances.put(name, racersDistances.get(name) + distance);
            }

            input = scanner.nextLine();
        }
        List<String> sorted = racersDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3).map(Map.Entry::getKey).collect(Collectors.toList());


        System.out.println("1st place: " + sorted.get(0));
        System.out.println("2nd place: " + sorted.get(1));
        System.out.println("3rd place: " + sorted.get(2));

    }
}
