/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition : Write a program that converts British
 * pounds to US dollars formatted to 3th decimal point.
 * 1 British Pound = 1.31 Dollars
 *
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        double converted = input*1.31;

        System.out.printf("%.03f",converted);

    }
}
