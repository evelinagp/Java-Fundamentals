package AssociativeArrays7;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3NumbersLab05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(e -> Integer.parseInt(e))
                .sorted((n1, n2) -> n2.compareTo(n1)).limit(3).collect(Collectors.toList());

        for (Integer num : nums) {
            System.out.print(num + " ");
        }
    }
}
