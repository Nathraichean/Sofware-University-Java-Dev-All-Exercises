/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split(" ")).filter(w -> w.length() % 2 == 0).toArray(String[]::new);

        for (String word:words) {
            System.out.println(word);
        }

    }
}
