package LISTS5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSetME053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());

        List<Integer> drumSet = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> initialQuality = new ArrayList<>();
        initialQuality.addAll(drumSet);

        String input = scanner.nextLine();

        while (!"Hit it again, Gabsy!".equals(input)) {
            int currentPower = Integer.parseInt(input);

            for (int i = 0; i < drumSet.size(); i++) {
                drumSet.set(i, drumSet.get(i) - currentPower);
            }

            for (int i = 0; i < drumSet.size(); i++) {

                if (drumSet.get(i) <= 0) {

                    if (savings - (initialQuality.get(i) * 3) >= 0) {
                        drumSet.set(i, initialQuality.get(i));
                        savings -= (initialQuality.get(i) * 3);
                    } else {
                        drumSet.remove(i);
                        initialQuality.remove(i);
                        if (i != drumSet.size() - 1) {
                            i = i - 1;
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        for (Integer drum : drumSet) {
            System.out.print(drum + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
