package ObjectsAndClasses6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsLab05 {

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

    public StudentsLab05(String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<StudentsLab05> students = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] commands = line.split(" ");
            if (commands.length == 4) {

                String firstName = commands[0];
                String lastName = commands[1];
                int age = Integer.parseInt(commands[2]);
                String hometown = commands[3];

                StudentsLab05 student = new StudentsLab05(firstName, lastName, age, hometown);

//                student.setFirstName(firstName);
//                student.setLastName(lastName);
//                student.setAge(age);
//                student.setHometown(hometown);

                students.add(student);
            } else if (commands.length == 5) {

                String firstName = commands[0];
                String lastName = commands[1];
                int age = Integer.parseInt(commands[2]);
                String hometown = commands[3] + " " + commands[4];

                StudentsLab05 student = new StudentsLab05(firstName, lastName, age, hometown);
//
//                student.setFirstName(firstName);
//                student.setLastName(lastName);
//                student.setAge(age);
//                student.setHometown(hometown);

                students.add(student);
            }
            line = scanner.nextLine();
        }
        String filterCity = scanner.nextLine();
        for (StudentsLab05 student : students) {
            if (student.getHometown().equals(filterCity)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(),
                        student.getAge());

            }
        }
    }
}


