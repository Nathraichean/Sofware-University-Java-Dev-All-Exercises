/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {
            int pos2 = rnd.nextInt(words.length);

            String tempPos1 = words[i];
            String tempPos2 = words[pos2];

            words[i] = tempPos2;
            words[pos2] = tempPos1;
        }

        System.out.println(String.join(System.lineSeparator(), words));

    }
}
