package BasicSyntaxConditionalStatementsAndLoops1Exercise;

import java.util.Scanner;

public class PadawanEquipment09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;
        double money = Double.parseDouble(scanner.nextLine());
        double students = Double.parseDouble(scanner.nextLine());
        double lightsabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());

        double beltReduced = 0;
        for (int i = 6; i <= students; i += 6) {
            beltReduced++;
        }
        if (students >= 6) {
            sum += (lightsabers * Math.ceil(students * 1.1)) + (robes * students) + ((belts * students) - beltReduced * belts);
        } else {
            sum += (lightsabers * Math.ceil(students * 1.1)) + (robes * students) + (belts * students);
            money -= sum;
        }

        if (money >= sum) {
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", sum - money);
        }
    }
}
