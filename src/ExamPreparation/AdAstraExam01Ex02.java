package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstraExam01Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(?<symbols>[#?\\|?])(?<name>[A-Za-z\\s]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);


//  The calories will be an integer between 0-10000
//Calculate the total calories of all food items and then determine
// how many days you can last with the food you have. Keep in mind that you need 2000kcal a day.
        List<String> products = new ArrayList<>();
        int totalCalories = 0;
        while (matcher.find()) {
            String name = matcher.group("name");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            if (calories >= 0 && calories <= 10000) {
                totalCalories += calories;

                products.add(String.format("Item: %s, Best before: %s, Nutrition: %d%n", name, date, calories).trim());
            }

        }
        int days = totalCalories / 2000;
        if (days > 0) {
            System.out.printf("You have food to last you for: %d days!%n", days);
            for (String product : products) {
                System.out.println(product);
            }
        } else {
            System.out.println("You have food to last you for: 0 days!");
        }
    }
}
