package FundamentalsMidExams.MidExam06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHuntMidExam06Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> chestContent = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] tokens = command.split("\\s+");
            String currentCommand = tokens[0];

            if (currentCommand.equals("Loot")) {
                for (int i = 1; i < tokens.length; i++) {
                    if (!chestContent.contains(tokens[i])) {
                        chestContent.add(0, tokens[i]);
                    }
                }
            } else if (currentCommand.equals("Drop")) {
                int dropIndex = Integer.parseInt(tokens[1]);
                if (dropIndex < 0 || dropIndex >= chestContent.size()) {
                    command = scanner.nextLine();
                    continue;
                }
                String itemToDrop = chestContent.remove(dropIndex);
                chestContent.add(itemToDrop);


            } else if (currentCommand.equals("Steal")) {
                int stealAmount = Integer.parseInt(tokens[1]);
                List<String> stolenList = new ArrayList<>();
                String output = "";
                if (stealAmount >= chestContent.size()) {
                    output = String.join(", ", chestContent);
                    System.out.println(output);
                    chestContent.clear();
                    break;
                } else {

                    for (int i = 0; i < stealAmount; i++) {
                        int lastIndex = chestContent.size() - 1;
                        stolenList.add(0, chestContent.remove(lastIndex));
                    }
                    output = String.join(", ", stolenList);
                    System.out.println(output);
                }
            }
            command = scanner.nextLine();
        }
        int totalSizeOfLoot = 0;
        for (String currentLoot : chestContent) {
            totalSizeOfLoot += currentLoot.length();
        }
        if (totalSizeOfLoot == 0) {
            System.out.println("Failed treasure hunt.");

        } else {
            double avrPrice = 1.0 * totalSizeOfLoot / chestContent.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", avrPrice);
        }
    }
}
