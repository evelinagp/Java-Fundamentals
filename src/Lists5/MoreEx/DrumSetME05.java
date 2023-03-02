package Lists5.MoreEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSetME05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());

        List<Integer> drumsQuality = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> initialQuality = new ArrayList<>();

        if (savings >= 0.00 && savings <= 10000.00) {
            for (int i = 0; i < drumsQuality.size(); i++) {
                if (drumsQuality.get(i) >= 1 && drumsQuality.get(i) <= 1000) {
                    initialQuality.add(drumsQuality.get(i));
                }
            }
        }
        String input = scanner.nextLine();
        while (!input.equals("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(input);
            if (hitPower >= 0 && hitPower <= 1000) {
                for (int i = 0; i < drumsQuality.size(); i++) {
                    drumsQuality.set(i, drumsQuality.get(i) - hitPower);
                }
                for (int i = 0; i < drumsQuality.size(); i++) {

                    if (drumsQuality.get(i) <= 0) {
                        if (savings - initialQuality.get(i) * 3 >= 0) {
                            drumsQuality.set(i, initialQuality.get(i));
                            savings -= initialQuality.get(i) * 3;
                        } else {
                            drumsQuality.remove(i);
                            initialQuality.remove(i);
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (
                Integer number : drumsQuality) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
