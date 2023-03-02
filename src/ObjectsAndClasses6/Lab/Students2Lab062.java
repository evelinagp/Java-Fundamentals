package ObjectsAndClasses6.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2Lab062 {

    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    public void setHometown(String hometown) {

        this.hometown = hometown;
    }

    public String getHometown() {
        return hometown;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Students2Lab062(String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Students2Lab062> students = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] commands = line.split(" ");
            if (commands.length == 4) {

                String firstName = commands[0];
                String lastName = commands[1];
                int age = Integer.parseInt(commands[2]);
                String hometown = commands[3];

                if (isExistingStudent(students, firstName, lastName)) {
                    Students2Lab062 student = getStudent(students, firstName, lastName, age, hometown);
                } else {
                    Students2Lab062 student = new Students2Lab062(firstName, lastName, age, hometown);
                    students.add(student);
//                student.setFirstName(firstName);
//                student.setLastName(lastName);
//                student.setAge(age);
//                student.setHometown(hometown);
                }
            } else if (commands.length == 5) {

                String firstName = commands[0];
                String lastName = commands[1];
                int age = Integer.parseInt(commands[2]);
                String hometown = commands[3] + " " + commands[4];

                Students2Lab062 student = new Students2Lab062(firstName, lastName, age, hometown);
//
//                student.setFirstName(firstName);
//                student.setLastName(lastName);
//                student.setAge(age);
//                student.setHometown(hometown);

                students.add(student);
            }
            line = scanner.nextLine();
        }
        String city = scanner.nextLine();
        students.stream().filter(c -> c.getHometown().equals(city)).
                forEach(s -> System.out.printf("%s %s is %d years old%n", s.firstName, s.getLastName(), s.getAge()));
    }

    private static Students2Lab062 getStudent(List<Students2Lab062> students, String firstName, String lastName, int age, String hometown) {
        Students2Lab062 existingStudent = null;
        for (Students2Lab062 student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
                existingStudent.setAge(age);
                existingStudent.setHometown(hometown);
            }
        }
        return existingStudent;
    }

    private static boolean isExistingStudent(List<Students2Lab062> students, String firstName, String lastName) {

        for (Students2Lab062 student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}