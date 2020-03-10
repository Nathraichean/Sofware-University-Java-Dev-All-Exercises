/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().trim().split(", ");
        Article article = new Article(input[0],input[1],input[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(": ");

            switch (command[0]){

                case "Edit":
                    article.edit(command[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(command[1]);
                    break;
                case "Rename":
                    article.rename(command[1]);
                    break;

            }
        }

        System.out.println(article.toString());

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

        public void edit (String newContent){
            this.setContent(newContent);
        }
        public void changeAuthor (String newAuthor){
            this.setAuthor(newAuthor);
        }
        public void rename (String newTitle){
            this.setTitle(newTitle);
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
