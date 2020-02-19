/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition : Write a method to print the smallest of three integer numbers.
 * Use appropriate name for the method.
 *
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(getSmallestNumber(a,b,c));

    }

    public static int getSmallestNumber(int a, int b, int c){

        if ( a <= b && a <= c){
            return a;
        }
        else if (b <= a && b <= c){
            return b;
        }
        else {
            return c;
        }

    }
}
