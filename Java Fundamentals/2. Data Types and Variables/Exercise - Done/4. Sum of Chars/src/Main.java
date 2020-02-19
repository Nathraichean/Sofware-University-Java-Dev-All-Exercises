/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int charSum = 0;

        for (int i = 0; i < n; i++) {
            char character = scanner.nextLine().toCharArray()[0];
            charSum+=character;
        }

        System.out.println("The sum equals: " + charSum);

    }
}
