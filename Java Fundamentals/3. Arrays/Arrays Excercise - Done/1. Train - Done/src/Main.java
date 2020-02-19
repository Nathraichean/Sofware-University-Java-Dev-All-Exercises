/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition : You will be given a count of
 * wagons in a train n. On the next n lines
 * you will receive how many people are going
 * to get on that wagon. At the end print the
 * whole train and after that the sum of the
 * people in the train.
 *
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    //init
        Scanner scanner = new Scanner(System.in);

	    int n = Integer.parseInt(scanner.nextLine());
	    int sum = 0;
        int array[] = new int[n];

        //Adds elements from console into the array
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        //Prints every element + adds it to sum
        for (int e: array) {
            System.out.print(e + " ");
            sum += e;
        }

        //Prints new line + sum
        System.out.println();
        System.out.println(sum);
    }
}
