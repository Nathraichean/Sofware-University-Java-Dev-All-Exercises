/*
  Excercise done by Svetozar Blazhev
  student of Software University

  Condition : Write a program that finds the longest
  sequence of equal elements in an array of integers.
  If several longest sequences exist, print the
  leftmost one.

 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // init.
	    Scanner scanner = new Scanner(System.in);

	    // Input
        int[] numArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray ();
        // Gets filled if there is a sequence of numbers
        int[] sequenceArray = new int[numArray.length];
        // Saves the longest sequence
        int[] biggestSequenceArray = new int[numArray.length];

        // Keeps track of the index for pre-filled sequenceArray
        int indexCounter = 0;
        // Keeps track of the biggest sequence in counter form
        int counter = 1;
        // Saves the biggest counter so far, thus keeping track of the longest sequence
        int maxCounter = 0;




        // Loop for every number and store the data
        for (int i = 0; i < numArray.length; i++) {
            //Check if first number
            if (i == 0){
                // Sets the first element to be equal in case it is a short input
                // with no repeated numbers or if the input is 1 number only
                sequenceArray[0] = numArray[0];
            }
            // If current number is the same as the previous one
            else if (numArray[i] == numArray[i-1]){
                sequenceArray[indexCounter++] = numArray[i-1];
                sequenceArray[indexCounter] = numArray[i];
                counter++;

                // In case that the biggest sequence involves the last number,
                // in that case this is the end of the loop -
                // Stores the data if the sequence is bigger than the current saved one
                if (counter > maxCounter) {
                    biggestSequenceArray = sequenceArray;
                    maxCounter = counter;
                }
            }
            // If the current number is not the same as the previous one
            else if (numArray[i] != numArray[i-1]){
                // Stores the data if the sequence is bigger than the current saved one
                if (counter > maxCounter) {
                    biggestSequenceArray = sequenceArray;
                    maxCounter = counter;
                }

                // Resets previously stored data, the necessary data should already be saved in the variables
                sequenceArray = new int[numArray.length];
                indexCounter = 0;
                counter = 1;
            }
        }

        // Prints all
        for (int i = 0; i < maxCounter; i++) {
            System.out.print(biggestSequenceArray[i] + " ");
        }
    }
}
