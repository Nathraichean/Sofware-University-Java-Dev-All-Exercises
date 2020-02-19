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

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        stringRepeater(input,n);
    }

    public static void stringRepeater(String input, int repetitions){
        int counter = repetitions;

        for (int i = 0; i < counter; i++) {
            System.out.print(input);
        }

    }
}
