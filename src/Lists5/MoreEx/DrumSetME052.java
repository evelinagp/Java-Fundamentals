package Lists5.MoreEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DrumSetME052 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double savings = Double.parseDouble(reader.readLine());

        List<Integer> drumsQuality = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> initialQuality = new ArrayList();

        if (savings >= 0.00 && savings <= 10000.00)
            for (int i = 0; i < drumsQuality.size(); i++) {
                if (drumsQuality.get(i) >= 1 && drumsQuality.get(i) <= 1000) {
                    initialQuality.add(drumsQuality.get(i));
                }
            }
        String input = reader.readLine();
        while (!input.equals("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(input);
            if (hitPower >= 0 && hitPower <= 1000) {
                for (int i = 0; i < drumsQuality.size(); i++) {
                    drumsQuality.set(i, drumsQuality.get(i) - hitPower);
                    if (drumsQuality.get(i) <= 0 && savings >= initialQuality.get(i) * 3) {
                        drumsQuality.set(i, initialQuality.get(i));
                        savings -= initialQuality.get(i) * 3;
                    } else if (drumsQuality.get(i) <= 0 && savings < initialQuality.get(i) * 3) {
                        drumsQuality.remove(i);
                        initialQuality.remove(i);
                        if (i != drumsQuality.size() - 1) {
                            i = i - 1;
                        }
                    }
                }
            }
            input = reader.readLine();
        }
        for (Integer number : drumsQuality) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
