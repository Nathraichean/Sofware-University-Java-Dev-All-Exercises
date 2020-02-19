/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Init
        Scanner scanner = new Scanner(System.in);

        boolean evenNumber = false;

        while (!evenNumber){
            int input = Integer.parseInt(scanner.nextLine());
            if (input%2 == 0){
                System.out.print("The number is: ");
                System.out.println(Math.abs(input));
                evenNumber = true;
            }
            else{
                System.out.println("Please write an even number.");
            }
        }

    }
}
