/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals(input.toLowerCase())){
            System.out.println("lower-case");
        }
        else System.out.println("upper-case");
    }
}
