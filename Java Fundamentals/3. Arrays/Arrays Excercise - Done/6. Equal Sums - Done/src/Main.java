/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition : Write a program that determines if there exists
 * an element in the array such that the sum of the elements on
 * its left is equal to the sum of the elements on its right.
 * If there are no elements to the left / right, their sum is
 * considered to be 0. Print the index that satisfies the
 * required condition or “no” if there is no such index.
 *
 */


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //init
        int[] numArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray ();
        int leftSideSum = 0;
        int rightSideSum = 0;
        int indexOfEqualSums = 0;
        boolean hasIndexOfEqualSums = false;

        // Loop that checks every number's left side sum and right side sum
        for (int i = 0; i < numArray.length; i++) {
            // Checks if array is 1 number long
            if (numArray.length == 1){
                hasIndexOfEqualSums = true;
            }
            else{
                // Calculates left sum
                for (int j = i+1; j < numArray.length; j++) {
                    rightSideSum += numArray[j];
                }
                // Calculates right sum
                for (int j = 0 ; j < i; j++) {
                    leftSideSum += numArray[j];
                }
                // Checks if both sides of the current index are equal and sets it as an equal sums index
                if (leftSideSum == rightSideSum){
                    indexOfEqualSums = i;
                    hasIndexOfEqualSums = true;
                }
                // If they are not the same, reset their values for the next calculation
                else{
                    rightSideSum = 0;
                    leftSideSum = 0;
                }
            }
        }
        // If it has found an equal sum ; print it
        if (hasIndexOfEqualSums){
            System.out.println(indexOfEqualSums);
        }
        // If not - print no
        else {
            System.out.println("no");
        }
    }
}
