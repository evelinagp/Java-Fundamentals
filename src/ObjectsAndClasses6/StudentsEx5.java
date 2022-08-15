package ObjectsAndClasses6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsEx5 {

    static class Student {

        String firstName;
        String lastName;
        double grade;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }

        public String studentInfo() {
            return String.format("%s %s: %.2f", getFirstName(), getLastName(), getGrade());
        }

        public Student(String firstName, String lastName, double averageScore) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = averageScore;

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> allStudents = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String firstName = data[0];
            String lastName = data[1];
            double grade = Double.parseDouble(data[2]);

            Student student = new Student(firstName, lastName, grade);

            allStudents.add(student);

        }
        allStudents.stream().sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()))
                .forEach(student -> System.out.println(student.studentInfo()));
    }
}

