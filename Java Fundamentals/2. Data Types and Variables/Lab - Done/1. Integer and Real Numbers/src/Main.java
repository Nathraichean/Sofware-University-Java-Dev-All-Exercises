/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition : You will be given an integer that will
 * be distance in meters. Write a program that converts
 * meters to kilometers formatted to the second decimal point.
 *
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        input /= 1000;

        System.out.printf("%.02f", input);
    }
}
