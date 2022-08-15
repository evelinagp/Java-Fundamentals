package RegularExpressions9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncomeEx03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regexEmail = "^%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$$";
        Pattern pattern = Pattern.compile(regexEmail);

        String input = scanner.nextLine();

        double totalPrice = 0;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double productPrice = count * price;
                System.out.printf("%s: %s - %.2f%n", name, product, productPrice);
                totalPrice += productPrice;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalPrice);
    }
}

