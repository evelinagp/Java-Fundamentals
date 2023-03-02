package BasicSyntaxConditionalStatementsAndLoops1;

import java.util.Scanner;

public class VacationEx03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peopleNumber = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double sum = 0;
        if ("Students".equals(typeOfGroup)) {
            if ("Friday".equals(day)) {
                if (peopleNumber >= 30) {
                    sum = (8.45 * 0.85) * peopleNumber;
                } else {
                    sum += 8.45 * peopleNumber;
                }
            } else if ("Saturday".equals(day)) {
                if (peopleNumber >= 30) {
                    sum = (9.80 * 0.85) * peopleNumber;
                } else {
                    sum += 9.80 * peopleNumber;
                }
            } else if ("Sunday".equals(day)) {
                if (peopleNumber >= 30) {
                    sum = (10.46 * 0.85) * peopleNumber;
                } else {
                    sum += 10.46 * peopleNumber;
                }
            }
        } else if ("Business".equals(typeOfGroup)) {
            if ("Friday".equals(day)) {
                if (peopleNumber >= 100) {
                    peopleNumber -= 10;
                }
                sum += 10.90 * peopleNumber;
            } else if ("Saturday".equals(day)) {
                if (peopleNumber >= 100) {
                    peopleNumber -= 10;
                }
                sum += 15.60 * peopleNumber;
            } else if ("Sunday".equals(day)) {
                if (peopleNumber >= 100) {
                    peopleNumber -= 10;
                }
                sum += 16.00 * peopleNumber;
            }
        } else if ("Regular".equals(typeOfGroup)) {
            if ("Friday".equals(day)) {
                sum = 15 * peopleNumber;
            } else if ("Saturday".equals(day)) {
                sum = 20 * peopleNumber;
            } else if ("Sunday".equals(day)) {
                sum = 22.50 * peopleNumber;
            }
            if (peopleNumber >= 10 && peopleNumber <= 20) {
                sum *= 0.95;
            }
        }
        System.out.printf("Total price: %.2f",sum);
    }
}



