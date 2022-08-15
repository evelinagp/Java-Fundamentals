package Arrays3Exercise;

import java.util.Scanner;

public class CommonElementsEx02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");


        for (int j = 0; j < secondArray.length; j++) {
            for (int i = 0; i < firstArray.length; i++) {
                if (secondArray[j].equals(firstArray[i])) {
                    System.out.print(secondArray[j] + " ");
                }
            }
        }
    }
}
