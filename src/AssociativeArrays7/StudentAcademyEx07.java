package AssociativeArrays7;

import java.util.*;

public class StudentAcademyEx07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }
        students.entrySet().stream().sorted((f, s) -> {
            double firstAv = f.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            double secondAv = s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            return Double.compare(secondAv, firstAv);
        }).forEach(s -> {
            double average = s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            if (average >= 4.5) {
                System.out.printf("%s -> %.2f%n", s.getKey(),average);
            }
        });
    }
}
