package ObjectsAndClasses6.MoreEx;

import java.time.LocalDate;

public class TeamworkProjectsME04 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalDate newDate = date.plusDays(10);
        System.out.println(newDate);
    }
}
