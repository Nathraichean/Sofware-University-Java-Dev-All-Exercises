/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            list.add(input);
        }

        Collections.sort(list);

        int counter = 1;
        for (String string: list) {
            System.out.println(counter++ + "." + string);
        }


    }
}
