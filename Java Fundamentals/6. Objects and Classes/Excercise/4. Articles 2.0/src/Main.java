/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        ArrayList<Article> articleList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().trim().split(", ");
            Article article = new Article(input[0],input[1],input[2]);
            articleList.add(article);
        }

        String command = scanner.nextLine();

        switch (command){

            case "title":
                articleList.stream()
                            .sorted(Comparator.comparing(Article::getTitle))
                            .forEach(article -> System.out.printf("%s - %s: %s\n",article.getTitle(),article.getContent(),article.getAuthor()));
                break;
            case "content":
                articleList.stream()
                            .sorted(Comparator.comparing(Article::getContent))
                            .forEach(article -> System.out.printf("%s - %s: %s\n",article.getTitle(),article.getContent(),article.getAuthor()));
                break;
            case "author":
                articleList.stream()
                            .sorted(Comparator.comparing(Article::getAuthor))
                            .forEach(article -> System.out.printf("%s - %s: %s\n",article.getTitle(),article.getContent(),article.getAuthor()));
                break;
        }

    }

    public static class Article {
        private String title;
        private String content;
        private String author;

        public Article(){}
        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title,this.content,this.author);
        }

        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }
        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
    }
}
