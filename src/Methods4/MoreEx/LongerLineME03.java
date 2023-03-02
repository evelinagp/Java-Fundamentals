package Methods4.MoreEx;

import java.util.Scanner;

public class LongerLineME03 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

        System.out.println(LongestLine(x1, y1, x2, y2, x3, y3, x4, y4));

    }

    private static String LongestLine(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {

        StringBuilder longest = new StringBuilder();

        int firstPoint = Math.abs(x1) + Math.abs(y1);
        int secondPoint = Math.abs(x2) + Math.abs(y2);
        int thirdPoint = Math.abs(x3) + Math.abs(y3);
        int fourthPoint = Math.abs(x4) + Math.abs(y4);
        int firstLine = firstPoint + secondPoint;
        int secondLine = thirdPoint + fourthPoint;

        if (firstLine >= secondLine) {
            if (firstPoint <= secondPoint) {
                longest.append(String.format("(%d, %d)(%d, %d)", x1, y1, x2, y2));
            } else {
                longest.append(String.format("(%d, %d)(%d, %d)", x2, y2, x1, y1));
            }
        } else {
            if (thirdPoint <= fourthPoint) {
                longest.append(String.format("(%d, %d)(%d, %d)", x3, y3, x4, y4));
            } else {
                longest.append(String.format("(%d, %d)(%d, %d)", x4, y4, x3, y3));
            }
        }
        return longest.toString();
    }
}



