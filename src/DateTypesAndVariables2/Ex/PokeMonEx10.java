package DateTypesAndVariables2.Ex;

import java.util.Scanner;

public class PokeMonEx10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int initialPokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int countOfPokedTargets = 0;

        int pokePower = initialPokePower;
        while (pokePower >= distance) {
            pokePower -= distance;
            countOfPokedTargets++;
            if (pokePower == 0.5 * initialPokePower) {
                pokePower /= exhaustionFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(countOfPokedTargets);

    }
}
