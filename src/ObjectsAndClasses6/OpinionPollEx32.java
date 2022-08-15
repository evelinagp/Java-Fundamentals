package ObjectsAndClasses6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPollEx32 {
    static class People {

        String name;
        int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public People(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s - %d", getName(), getAge());
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            List<People> allPeople = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String[] info = scanner.nextLine().split("\\s+");
                String name = info[0];
                int age = Integer.parseInt(info[1]);
                People people = new People(name, age);
                allPeople.add(people);
            }
            allPeople.stream().filter(people -> people.getAge() > 30).sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).
                    forEach(people -> System.out.println(people.toString()));
        }
    }
}

