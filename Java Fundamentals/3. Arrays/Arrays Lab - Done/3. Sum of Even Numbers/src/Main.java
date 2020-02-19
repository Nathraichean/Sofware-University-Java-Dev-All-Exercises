/*
 * This console application was created by Svetozar Blazhev
 *
 * It is part of the Software University curriculum available
 * as exercises.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                sum += numbers[i];
            }
        }

        System.out.println(sum);
    }
}
