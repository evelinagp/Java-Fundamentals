package Arrays3Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequenceLISME04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] seq = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();
        int[] len = new int[seq.length];
        int[] prev = new int[len.length-1];

        int maxLen = 0;
        int lastIndex = -1;
        for (int x = 0; x < seq.length; x++) {
            len[x] = 1;
            prev[x] = -1;
            for (int i = 0; i <= x; i++) {
                if ((seq[i] < seq[x]) && len[i] + 1 > len[x]) {
                    len[x] = len[i] + 1;
                    prev[x] = i;
                }
                if (len[x] > maxLen) {
                    maxLen = len[x];
                    lastIndex = x;
//                }
//            }
//        int[]  = new int numbers;

//            int length
//            for (int p = 0; p < numbers.length ; p++) {
//                int LIS = length [p];
                }
            }
            for (int i = 0; i < len.length; i++) {
                System.out.print(len[x] + " ");
// •	Assume we have n numbers in an array nums[0…n-1].
//•	Let len[p] holds the length of the longest increasing subsequence (LIS) ending at position p.
//•	In a for loop, we shall calculate len[p] for p = 0 … n-1 as follows:
            }
        }
    }
}

