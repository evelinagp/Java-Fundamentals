package AssociativeArrays7.Ex;

import java.util.*;

public class CompanyUsersEx08 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companies = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("->");
            String company = tokens[0];
            String employee = tokens[1];

            companies.putIfAbsent(company, new LinkedList<>());
            List<String> list = companies.get(company);
            if (!list.contains(employee)) {
                list.add(employee);
            }
                input = scanner.nextLine();
            }

//        companies.entrySet().stream().forEach(entry -> {
//            System.out.println(entry.getKey());
//            entry.getValue().forEach(value -> System.out.println("-- " + value));
//        } );

        companies.entrySet().stream()
                .forEach(c -> {
                    System.out.println(c.getKey());
                    c.getValue().forEach(id -> System.out.printf("--%s%n", id));
                });
        }
    }
