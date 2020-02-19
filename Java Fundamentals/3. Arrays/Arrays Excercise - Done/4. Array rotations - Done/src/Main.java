/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition : Write a program that receives
 * an array and number of rotations you have
 * to perform (first element goes at the end)
 * Print the resulting array.
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Init.
	    Scanner scanner = new Scanner(System.in);
	    int[] numArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray ();
	    int[] newNumArray = new int[numArray.length];
	    int numOfRotations = Integer.parseInt(scanner.nextLine());

	    //Begin rotation cycles
        for (int i = 0; i < numOfRotations; i++) {

            //Store first number to put it on the end
            int firstNumber = numArray[0];
            //Place every element from the initial array with one index back on the new array
            for (int j = 1; j < numArray.length; j++) {
                newNumArray[j-1] = numArray[j];
            }
            //Put the first number from the first array on the end of the new array
            newNumArray[numArray.length-1] = firstNumber;
            //Make the first array equal to the new array so it updates on the next rotation
            numArray = newNumArray;
        }
        // After all of the rotations, print all elements from the first array
        for (int e: numArray) {
            System.out.print(e + " ");
        }
    }
}

