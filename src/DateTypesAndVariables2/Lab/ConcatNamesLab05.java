package DateTypesAndVariables2.Lab;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ConcatNamesLab05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName =scanner.nextLine();
        String lastName = scanner.nextLine();
        String delimiter = scanner.nextLine();

    //second way with String.join
//        String [] concat = new String[]{firstName, lastName};
//        System.out.println(String.join(delimiter, concat));

        System.out.println(firstName + delimiter + lastName);
    }
}
