package ObjectsAndClasses6;

import java.util.Scanner;

public class ArticlesEx22 {

    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public String toString() {
            return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] data = scanner.nextLine().split(", ");
            String title = data[0];
            String content = data[1];
            String author = data[2];

            Article article = new Article(title, content, author);

            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < n; i++) {
                String[] tokens = scanner.nextLine().split(": ");
                String command = tokens[0];
                String newContentAuthorTitle = tokens[1];
                switch (command) {
                    case "Edit":
                        article.setContent(newContentAuthorTitle);
                        break;
                    case "ChangeAuthor":
                        article.setAuthor(newContentAuthorTitle);
                        break;
                    case "Rename":
                        article.setTitle(newContentAuthorTitle);
                        break;
                }
            }
            System.out.println(article.toString());
        }
    }
}
