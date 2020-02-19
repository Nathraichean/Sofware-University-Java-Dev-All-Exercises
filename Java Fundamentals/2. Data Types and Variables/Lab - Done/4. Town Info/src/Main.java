/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        long population = Long.parseLong(scanner.nextLine());
        long area = Long.parseLong(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", town, population, area);

    }
}
