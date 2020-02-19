/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Init
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade > 2.99){
            System.out.println("Passed!");
        }
        else{
            System.out.println("Failed!");
        }
    }
}
