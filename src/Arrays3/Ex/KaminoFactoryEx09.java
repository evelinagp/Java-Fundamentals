package Arrays3.Ex;

import java.util.Scanner;

public class KaminoFactoryEx09 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        int currentFirstIndex = 0;
        int currentNumberLine = 0;
        int bestline = 0;
        int needIndexInLine = -1;
        int lowIndex = -1;
        int bestSubs1 = Integer.MIN_VALUE;
        String sequenceDNA = "";
        int greaterSum = 0;

        String line = scanner.nextLine();

        while (!line.equals("Clone them!")) {
            currentNumberLine++;
            String[] sequence = line.split("!+");
            int[] numberSequence = new int[length];
            for (int i = 0; i < numberSequence.length; i++) {
                numberSequence[i] = Integer.parseInt(sequence[i]);
            }
            int currentCountSubs1 = 0;
            int currentSumLine = 0;
            int longestSubs1inLine = 0;

            for (int i = 0; i < numberSequence.length; i++) {
                int currentN = numberSequence[i];
                currentSumLine += currentN;
                if (currentN == 1) {
                    currentCountSubs1++;
                    currentFirstIndex = i - currentCountSubs1 + 1;
                } else {
                    currentCountSubs1 = 0;
                }
                if (currentCountSubs1 > longestSubs1inLine) {
                    longestSubs1inLine = currentCountSubs1;
                    needIndexInLine = currentFirstIndex;
                }
            }
            if (longestSubs1inLine > bestSubs1) {
                sequenceDNA = " ";
                bestSubs1 = longestSubs1inLine;
                bestline = currentNumberLine;
                lowIndex = needIndexInLine;
                greaterSum = currentSumLine;
                for (int i = 0; i < length; i++) {
                    sequenceDNA += numberSequence[i] + " ";
                }
            } else if (longestSubs1inLine == bestSubs1) {
                if (needIndexInLine < lowIndex) {
                    sequenceDNA = " ";
                    bestSubs1 = longestSubs1inLine;
                    bestline = currentNumberLine;
                    lowIndex = needIndexInLine;
                    greaterSum = currentSumLine;
                    for (int i = 0; i < length; i++) {
                        sequenceDNA += numberSequence[i] + " ";
                    }
                } else if (needIndexInLine == lowIndex) {
                    if (currentSumLine > greaterSum) {
                        sequenceDNA = "";
                        bestSubs1 = longestSubs1inLine;
                        bestline = currentNumberLine;
                        lowIndex = needIndexInLine;
                        greaterSum = currentSumLine;
                        for (int i = 0; i < length; i++) {
                            sequenceDNA += numberSequence[i] + " ";
                        }
                    }
                }
            }
            line = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestline, greaterSum);
        System.out.println(sequenceDNA);
    }
}

