package DateTypesAndVariables2.Ex;

import java.util.Scanner;

public class ElevatorEx03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = numOfPeople / capacity;

        if (numOfPeople <= capacity) {
            courses = 1;
        } else if (numOfPeople % capacity != 0) {
           courses += 1;
        }
        System.out.println(courses);
    }
}
