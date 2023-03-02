package Methods4.MoreEx;

import java.util.Scanner;

public class LongerLineME032 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x3 = Double.parseDouble(scanner.nextLine());
        double y3 = Double.parseDouble(scanner.nextLine());
        double x4 = Double.parseDouble(scanner.nextLine());
        double y4 = Double.parseDouble(scanner.nextLine());
        CheckAndPrintDistance(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public static double Distance(double x, double y) {
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distance;
    }

    private static void CheckAndPrintDistance(double x1, double y1, double x2, double y2, double x3, double y3,
                                              double x4, double y4) {

        double distancePoint1 = Distance(x1, y1);
        double distancePoint2 = Distance(x2, y2);
        double distancePoint3 = Distance(x3, y3);
        double distancePoint4 = Distance(x4, y4);
        double lengthPoint12 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double lengthPoint34 = Math.sqrt(Math.pow((x3 - x4), 2) + Math.pow((y3 - y4), 2));
        if (lengthPoint12 >= lengthPoint34) {
            if (distancePoint1 <= distancePoint2) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x1, y1, x2, y2);
            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x2, y2, x1, y1);
            }
        } else if (lengthPoint12 < lengthPoint34) {
            if (distancePoint3 <= distancePoint4) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x3, y3, x4, y4);
            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x4, y4, x3, y3);
            }
        }
    }
}