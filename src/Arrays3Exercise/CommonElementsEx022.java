package Arrays3Exercise;

import java.util.Scanner;

public class CommonElementsEx022 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstRow = scanner.nextLine().split(" ");
        String[] secondRow = scanner.nextLine().split(" ");

        for (String words2 : secondRow) {
            for (String words1 : firstRow) {
                if (words2.equals(words1)) {
                    System.out.print(words2 + " ");
                    break;
                }
            }
        }
    }
}
