package TextProcessing8;

import java.util.Scanner;

public class HTMLME05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleTitle = scanner.nextLine();
        String articleContent = scanner.nextLine();
        String comments = scanner.nextLine();
        System.out.printf("<h1>%n %s%n </h1>%n", articleTitle);
        System.out.printf("<article>%n %s%n </article>%n", articleContent);

        while (!comments.equals("end of comments")) {

            System.out.printf("<div>%n %s%n </div>%n", comments);
            comments = scanner.nextLine();
        }
    }
}

