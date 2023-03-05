package FundamentalsMidExams.MidExam01;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift01Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int peopleInQue = Integer.parseInt(scanner.nextLine());

        int[] currentStateLift = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(element -> Integer.parseInt(element)).toArray();

        boolean arePeopleInQueueFinished = false;

        for (int i = 0; i < currentStateLift.length; i++) {
            int peopleInWagon = currentStateLift[i];
            while (peopleInWagon < 4) {
                peopleInWagon++;
                peopleInQue--;
                if (peopleInQue == 0) {
                    arePeopleInQueueFinished = true;
                    break;
                }
            }
            currentStateLift[i] = peopleInWagon;
            if (arePeopleInQueueFinished) {
                break;
            }
        }
        if (currentStateLift[currentStateLift.length - 1] == 4 && peopleInQue > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleInQue);
        } else if (currentStateLift[currentStateLift.length - 1] < 4 && arePeopleInQueueFinished) {
            System.out.println("The lift has empty spots!");
        }
        for (int wagons : currentStateLift) {
            System.out.print(wagons + " ");
        }
    }
}