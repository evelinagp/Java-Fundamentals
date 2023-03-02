package DateTypesAndVariables2.Ex;

import java.util.Scanner;

public class SnowballsEx11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int snowballs = Integer.parseInt(scanner.nextLine());
        double maxValue = Double.MIN_VALUE;
        double maxSnow = Double.MIN_VALUE;
        double maxTime = Double.MIN_VALUE;
        double maxQuality = Double.MIN_VALUE;

        for (int i = 0; i < snowballs; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());

            double value = Math.pow((double) (snow / time), quality);
            if (value > maxValue) {
                maxValue = value;
                maxSnow = snow;
                maxTime = time;
                maxQuality = quality;
            }
        }
        System.out.printf("%.0f : %.0f = %.0f (%.0f)", maxSnow, maxTime, maxValue, maxQuality);
    }
}
