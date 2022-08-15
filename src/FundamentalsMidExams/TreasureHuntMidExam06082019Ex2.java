package FundamentalsMidExams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHuntMidExam06082019Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> chestContent = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] tokens = command.split("\\s+");
            String cureentCommand = tokens[0];

            if (command.equals("Loot")) {
                for (int i = 1; i < tokens.length; i++) {
                    if (!chestContent.contains(tokens[i])) {
                        chestContent.add(0, tokens[i]);
                    }
                }
            } else if (command.equals("Drop")) {
                int dropIndex = Integer.parseInt(tokens[1]);
                if (dropIndex < 0 || dropIndex >= chestContent.size()) {
                    break;
                }
                String itemToDrop = chestContent.remove(dropIndex);
                chestContent.add(itemToDrop);


            } else if (command.equals("Steel")) {
                int stealAmount = Integer.parseInt(tokens[1]);
                List<String> stolenList = new ArrayList<>();
                String output = "";
                if (stealAmount >= chestContent.size()) {
                    output = String.join(",", chestContent);
                    System.out.println(output);
                    chestContent.clear();
                    break;
                } else {

                    for (int i = 0; i < stealAmount; i++) {
                        int lastIndex = chestContent.size() - 1;
                        stolenList.add(chestContent.remove(lastIndex));
                    }
                    output = String.join(",", stolenList);
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
            System.out.printf("Average treasure gain %.2f pirate credits", avrPrice);
        }
    }
}
