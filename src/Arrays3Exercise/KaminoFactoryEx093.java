package Arrays3Exercise;

import java.util.Scanner;

public class KaminoFactoryEx093 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dnaLength = Integer.parseInt(scanner.nextLine());


        String theBestDNASequence = "";
        int greaterSum = 0;
        int longestCount1 = 0;
        int currentFirstIndex = 0;
        int lowIndex = 0;
        int bestSequenceIndex = 0;
        int currentLine = 0;
        int theBestLine = 0;


        String input = scanner.nextLine();
        while (!input.equals("Clone them!")) {
            currentLine++;
            String[] dnaSequences = input.split("!+");
            int[] sequencesWithNumbers = new int[dnaLength];

            for (int i = 0; i < sequencesWithNumbers.length; i++) {
                sequencesWithNumbers[i] = Integer.parseInt(dnaSequences[i]);
            }
            int currentCount1 = 0;
            int currentSum = 0;
            int currentLongestCount1 = 0;
            for (int i = 0; i < sequencesWithNumbers.length; i++) {
                int currentNumber = sequencesWithNumbers[i];
                currentSum += currentNumber;
                if (currentNumber == 1) {
                    currentCount1++;
                    currentFirstIndex = i - currentCount1 + 1;
                } else {
                    currentCount1 = 0;
                }
                if (currentCount1 > currentLongestCount1) {
                    currentLongestCount1 = currentCount1;
                    bestSequenceIndex = currentFirstIndex;
                }
            }
            if (currentLongestCount1 > longestCount1) {
                longestCount1 = currentLongestCount1;
                lowIndex = bestSequenceIndex;
                theBestLine = currentLine;
                greaterSum = currentSum;
                for (int i = 0; i < sequencesWithNumbers.length; i++) {
                    theBestDNASequence += sequencesWithNumbers[i] + " ";
                }
            } else if (currentLongestCount1 == longestCount1) {
                if (bestSequenceIndex < lowIndex) {
                    longestCount1 = currentLongestCount1;
                    lowIndex = bestSequenceIndex;
                    theBestLine = currentLine;
                    greaterSum = currentSum;
                } else if (bestSequenceIndex == lowIndex) {
                    if (currentSum > greaterSum) {
                        longestCount1 = currentLongestCount1;
                        lowIndex = bestSequenceIndex;
                        theBestLine = currentLine;
                        greaterSum = currentSum;
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n" + "%s%n", theBestLine, greaterSum, theBestDNASequence);
    }
}

