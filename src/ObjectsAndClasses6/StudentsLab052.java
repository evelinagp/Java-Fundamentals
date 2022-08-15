package ObjectsAndClasses6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsLab052 {

    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<StudentsLab052> students = new ArrayList<>();
        while (!input.equals("end")) {
            String[] studentsData = input.split("\\s+");
            String firstName = studentsData[0];
            String lastName = studentsData[1];
            int age = Integer.parseInt(studentsData[2]);
            StudentsLab052 student = new StudentsLab052();
            if (studentsData.length == 4) {
                String hometown = studentsData[3];
                student.setHometown(hometown);

                students.add(student);
            } else if (input.length() == 5) {
                String hometown = studentsData[3] + " " + studentsData[4];
                student.setHometown(hometown);
            }
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for (StudentsLab052 student : students) {
            if (student.getHometown().equals(city)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
