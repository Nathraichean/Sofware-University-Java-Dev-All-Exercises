/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Init
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        if (n > 10){
            sum = n*multiplier;
            System.out.println(n + " X " + multiplier + " = " + sum);
        }
        else{
            for (int i = multiplier; i <= 10; i++) {
                sum = n*i;
                System.out.println(n + " X " + i + " = " + sum);
            }
        }

    }
}
