/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition : Create a method that prints
 * the sign of an integer number.
 *
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        numberChecker(input);

    }

    public static void numberChecker(int n){
        if (n > 0){
            System.out.printf("The number %d is positive.", n);
        }
        else if (n < 0){
            System.out.printf("The number %d is negative.", n);
        }
        else {
            System.out.printf("The number %d is zero.",n);
        }
    }
}
