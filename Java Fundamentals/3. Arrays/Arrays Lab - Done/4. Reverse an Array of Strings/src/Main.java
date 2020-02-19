/*
 * This console application was created by Svetozar Blazhev
 *
 * It is part of the Software University curriculum available
 * as exercises.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int index = 0;

        String[] array;
        String input = scanner.nextLine();
        array = input.split(" ",0);
        String[] reversedArray = new String[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[index++] = array[i];
        }
        for (String e : reversedArray) {
            System.out.print(e + " ");
        }

    }
}
