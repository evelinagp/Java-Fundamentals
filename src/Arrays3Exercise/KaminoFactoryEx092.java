package Arrays3Exercise;

import java.util.Scanner;

public class KaminoFactoryEx092 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int length = Integer.parseInt(scan.nextLine());
            String sequenceDNA = "";
            int currentfirstindex = 0;
            int bestLine = 0;
            int currentNumberLine = 0;
            int bestSubs1 = Integer.MIN_VALUE;
            int needIndexInLine = -1;
            int greaterSum = 0;
            int lowIndex = -1;

            String input = scan.nextLine();
            while (!"Clone them!".equals(input)) {
                currentNumberLine++;

                String[] sequence = input.split("!+");
                int[] numberSequence = new int[length];
                for (int i = 0; i < numberSequence.length; i++) {
                    numberSequence[i] = Integer.parseInt(sequence[i]);
                }

                int currentCntsubs1 = 0;
                int currentSumLine = 0;
                int longestsubs1inLine = 0;

                for (int i = 0; i < numberSequence.length; i++) {
                    int cureentN = numberSequence[i];
                    currentSumLine += cureentN;
                    if (cureentN == 1) {
                        currentCntsubs1++;
                        currentfirstindex = i - currentCntsubs1 + 1;
                    } else {
                        currentCntsubs1 = 0;
                    }
                    if (currentCntsubs1 > longestsubs1inLine) {
                        longestsubs1inLine = currentCntsubs1;
                        needIndexInLine = currentfirstindex;
                    }
                }
                if (longestsubs1inLine > bestSubs1) {
//                    sequenceDNA = "";
                    bestSubs1 = longestsubs1inLine;
                    bestLine = currentNumberLine;
                    lowIndex = needIndexInLine;
                    greaterSum = currentSumLine;
                    for (int i = 0; i < length; i++) {
                        sequenceDNA += numberSequence[i] + " ";
                    }
                } else if (longestsubs1inLine == bestSubs1) {
                    if (needIndexInLine < lowIndex) {
//                        sequenceDNA = "";
                        bestSubs1 = longestsubs1inLine;
                        bestLine = currentNumberLine;
                        lowIndex = needIndexInLine;
                        greaterSum = currentSumLine;
                        for (int i = 0; i < length; i++) {
                            sequenceDNA += numberSequence[i] + " ";
                        }
                    } else if (needIndexInLine == lowIndex) {
                        if (currentSumLine > greaterSum) {
//                            sequenceDNA = "";
                            bestSubs1 = longestsubs1inLine;
                            bestLine = currentNumberLine;
                            lowIndex = needIndexInLine;
                            greaterSum = currentSumLine;
                            for (int i = 0; i < length; i++) {
                                sequenceDNA += numberSequence[i] + " ";
                            }
                        }
                    }
                }
                input = scan.nextLine();
            }
            System.out.println(String.format("Best DNA sample %d with sum: %d.", bestLine, greaterSum));
            System.out.println(sequenceDNA);
        }
    }