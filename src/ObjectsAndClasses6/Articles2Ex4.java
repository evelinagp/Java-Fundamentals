package ObjectsAndClasses6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Articles2Ex4 {

    static class Article {

        String title;
        String content;
        String author;

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;


        }

        public String toString() {
            return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Article> allArticles = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");
            String title = data[0];
            String content = data[1];
            String author = data[2];
            Article article = new Article(title, content, author);
            allArticles.add(article);

        }
        String input = scanner.nextLine();
        if (input.equals("title")) {
            allArticles.stream().sorted((t1, t2) -> t1.getTitle().compareTo(t2.getTitle()))
                    .forEach(article1 -> System.out.println(article1.toString()));
        } else if (input.equals("content")) {
            allArticles.stream().sorted((c1, c2) -> c1.getContent().compareTo(c2.getContent()))
                    .forEach(article1 -> System.out.println(article1.toString()));
        } else {
            allArticles.stream().sorted(Comparator.comparing(Article::getAuthor))
                    .forEach(article1 -> System.out.println(article1.toString()));
        }
    }
}



