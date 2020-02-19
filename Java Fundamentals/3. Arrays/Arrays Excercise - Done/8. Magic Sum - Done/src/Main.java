/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition : Write a program, which
 * prints all unique pairs in an array
 * of integers whose sum is equal to a
 * given number.
 *
 */


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        int[] numArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray ();
        int n = Integer.parseInt(scanner.nextLine());

        // Outer loop going through numbers
        for (int i = 0; i < numArray.length; i++) {

            // Inner lopp going through every number after the current [i] index number
            for (int j = i+1; j < numArray.length; j++) {

                if (numArray[i] + numArray[j] == n){
                    System.out.println(numArray[i] + " " + numArray[j]);
                }
            }
        }
    }
}
