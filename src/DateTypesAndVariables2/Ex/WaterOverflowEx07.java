package DateTypesAndVariables2.Ex;

import java.util.Scanner;

public class WaterOverflowEx07 {
    public static final int WATER_TANK_CAPACITY = 255;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int totalLitres = 0;
        for (int i = 0; i < n; i++) {
            int litres = Integer.parseInt(scanner.nextLine());
            if (litres + totalLitres > WATER_TANK_CAPACITY) {
                System.out.println("Insufficient capacity!");
            } else {
                totalLitres += litres;

            }
        }
        System.out.println(totalLitres);
    }
}
