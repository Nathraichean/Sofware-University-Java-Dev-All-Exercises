/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 * Write a method that receives two characters and
 * prints on a single line all the characters in
 * between them according to ASCII.
 *
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        char inputA = scanner.nextLine().toCharArray()[0];
        char inputB = scanner.nextLine().toCharArray()[0];

        printCharactersInRange(inputA,inputB);
    }
    
    public static void printCharactersInRange(char a, char b){

        char tempA = a;
        char tempB = b;

        if ( b < a) {
            tempA = b;
            tempB = a;
        }

        for (int i = tempA+1; i < tempB; i++) {

            System.out.print((char)i + " ");

        }
        
    }
}
