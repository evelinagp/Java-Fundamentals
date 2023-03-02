package Methods4.MoreEx;

import java.util.Scanner;

public class CenterPointME02 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        printMinX(x1, x2);
        printMinY(y1, y2);

    }

    private static void printMinY(int y1, int y2) {
        int minY = Integer.MAX_VALUE;
        if (Math.abs(y1) == Math.abs(y2)) {
            System.out.print(" " + y1 + ")");
        } else {
            if (Math.abs(y1) < Math.abs(y2)) {
                minY = y1;
            } else {
                minY = y2;
            }
            System.out.print(" " + minY + ")");
        }
    }


    private static void printMinX(int x1, int x2) {
        int minX = Integer.MAX_VALUE;

        if (Math.abs(x1) == Math.abs(x2)) {
            System.out.print("(" + x1 + ",");
        } else {
            if (Math.abs(x1) < Math.abs(x2)) {
                minX = x1;
            } else {
                minX = x2;
            }
            System.out.print("(" + minX + ",");
        }
    }
}

//If the points are on a same distance from the center, print only the first one.