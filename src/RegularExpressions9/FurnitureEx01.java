package RegularExpressions9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FurnitureEx01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9].*[0-9]*)!(?<quantity>[0-9]+)";
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Bought furniture:");
        double totalMoney = 0;
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                totalMoney += price * quantity;
                System.out.println(furniture);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total money spend: %.2f", totalMoney);
    }
}
