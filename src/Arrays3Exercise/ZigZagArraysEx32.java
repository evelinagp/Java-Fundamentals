package Arrays3Exercise;

import java.util.Scanner;

public class ZigZagArraysEx32 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] first = new int[n];
        int[] second = new int[n];

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                first[i] = Integer.parseInt(line[0]);
                second[i] = Integer.parseInt(line[1]);
            } else {
                first[i] = Integer.parseInt(line[1]);
                second[i] = Integer.parseInt(line[0]);
            }
        }
        for (int i : first) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : second) {
            System.out.print(i + " ");
        }
    }
}

