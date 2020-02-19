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
        
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 97; i < input+97; i++) {
            for (int j = 97; j <  input+97; j++) {
                for (int k = 97; k <  input+97; k++) {
                    System.out.print(String.valueOf((char)i));
                    System.out.print(String.valueOf((char)j));
                    System.out.print(String.valueOf((char)k));
                    System.out.println();
                }
            }
        }

    }
}
