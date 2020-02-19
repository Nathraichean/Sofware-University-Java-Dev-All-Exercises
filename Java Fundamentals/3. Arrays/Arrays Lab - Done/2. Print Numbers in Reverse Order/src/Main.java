/*
 * This console application was created by Svetozar Blazhev
 *
 * It is part of the Software University curriculum available
 * as exercises.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Init
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int numberInput;


        ArrayList array = new ArrayList<>(input);

        for (int i = 0; i < input; i++) {
            numberInput = scanner.nextInt();
            array.add(numberInput);
        }

        for (int i = array.size()-1; i >= 0; i--) {
            System.out.print(array.get(i) + " ");
        }
    }
}