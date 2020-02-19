/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition : Write a program which creates
 * 2 arrays. You will be given an integer n.
 * On the next n lines you get 2 integers.
 * Form 2 arrays as shown below.
 *
 */


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // init.
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[input];
        int[] secondArray = new int[input];
        boolean placeInFirstArray = true;

        // Cycles amount of times from the input
        for (int i = 0; i < input; i++) {

            // Creates a temp array with 2 numbers
            int[] tempArray = Arrays.stream(scanner.nextLine()
                                     .split(" "))
                                      .mapToInt(Integer::parseInt)
                                       .toArray ();

            // If placeInFirstArray is true ; puts first element in firstArray and etc.
            // placeInFirstArray determines in which array the numbers go so it gets flipped to false
            if (placeInFirstArray) {
                firstArray[i] = tempArray[0];
                secondArray[i] = tempArray[1];
                placeInFirstArray = false;
            }
            // The opposite happens. If it comes here placeInFirstArray is false,
            // so it flips it for the next cycle of the for loop.
            else {
                firstArray[i] = tempArray[1];
                secondArray[i] = tempArray[0];
                placeInFirstArray = true;
            }
        }

        // Prints
        for (int e : firstArray) {
            System.out.print(e + " ");
        }
        System.out.println();
        for (int e : secondArray) {
            System.out.print(e + " ");
        }
    }
}
