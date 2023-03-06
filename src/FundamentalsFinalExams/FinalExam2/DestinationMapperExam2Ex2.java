package FundamentalsFinalExams.FinalExam2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapperExam2Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String placesRegex = "([=/])(?<place>[A-Z][a-zA-Z]{2,})\\1";

        Pattern pattern = Pattern.compile(placesRegex);
        Matcher matcher = pattern.matcher(input);
        List<String> places = new ArrayList<>();
        int travelPoints = 0;
        while (matcher.find()) {
            String place = matcher.group(2);
            places.add(place);
            travelPoints += place.length();
        }
        System.out.println("Destinations: " + String.join(", ", places));
        System.out.printf("Travel Points: %d", travelPoints);
    }
}

