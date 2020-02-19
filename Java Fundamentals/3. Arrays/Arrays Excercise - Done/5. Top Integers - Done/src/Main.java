/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition : Write a program to find all the top
 * integers in an array. A top integer is an integer
 * which is bigger than all the elements to its right.
 *
 */


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    //init
        int[] numArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray ();
        int[] endArray = new int[20];
        int counter = 0;
        boolean topNumber = false;

        // For loop that iterates every number
        for (int i = 0; i < numArray.length; i++) {
            // Pre defines the current number as being the highest from the ones to its right
            topNumber = true;

            // For loop that iterates every number after the current iteration of the outer loop
            for (int j = i; j < numArray.length; j++) {
                // Checks if the current number from the outer loop is NOT bigger than every number after it
                if (!(numArray[i] > numArray[j])) {
                    if (i == j){
                        continue;
                    }
                    else if (numArray.length-1 != i){
                        topNumber = false;
                    }
                }
            }

            // After it has checked every number after the current number and topNumber is still true
            // it puts the current number into a new array to be printed later.
            if (topNumber) {
                endArray[counter++] = numArray[i];
            }
        }

        // After it has filled in the final array, it prints every element from it.
        //for (int e: endArray) {
        //    if (e != 0){
        //        System.out.print(e + " ");
        //    }
        //}

        // Prints every element from endArray up until the counter
        for (int i = 0; i < counter; i++) {
            System.out.print(endArray[i] + " ");
        }
    }
}
