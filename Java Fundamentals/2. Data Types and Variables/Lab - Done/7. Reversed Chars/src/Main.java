/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        char charOne = scanner.nextLine().toCharArray()[0];
        char charTwo = scanner.nextLine().toCharArray()[0];
        char charThree = scanner.nextLine().toCharArray()[0];

        System.out.println(String.valueOf(charThree)+" "+String.valueOf(charTwo)+" "+String.valueOf(charOne));
    }
}
