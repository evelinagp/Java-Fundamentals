package FundamentalsMidExams.MidExam02;

import java.util.Scanner;

public class SoftUniReceptionMidExam02Ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employee1EfficiencyPerHour = Integer.parseInt(scanner.nextLine());
        int employee2EfficiencyPerHour = Integer.parseInt(scanner.nextLine());
        int employee3EfficiencyPerHour = Integer.parseInt(scanner.nextLine());

        int studentsCount = Integer.parseInt(scanner.nextLine());

        int helpedStudentsPerHour = employee1EfficiencyPerHour + employee2EfficiencyPerHour + employee3EfficiencyPerHour;

        int hoursCounter = 0;

        while (studentsCount > 0) {
            studentsCount -= helpedStudentsPerHour;
            hoursCounter++;
            if (hoursCounter % 4 == 0) {
                hoursCounter++;
            }
        }
        System.out.printf("Time needed: %dh.", hoursCounter);
    }
}
