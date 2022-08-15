package Arrays3Exercise;

import java.util.Scanner;

public class ArrayRotationEx042 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        int rotation = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotation; i++) {
            String firstElement = array[0];

            //moving elements to the left
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstElement;
        }
        System.out.print(String.join(" ", array));
        }
    }

