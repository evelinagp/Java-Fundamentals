package DateTypesAndVariables2Ex;

import java.util.Scanner;

public class BeerKegsEx08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String biggerKegModel = "";
        double maxVolume = (float)Double.MIN_VALUE;
        for (int i = 1; i <=n ; i++) {
        String model = scanner.nextLine();
        double radius = Double.parseDouble(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > maxVolume){
                maxVolume = volume;
                biggerKegModel =  model;
            }
        }
        System.out.print(biggerKegModel);
    }
}
