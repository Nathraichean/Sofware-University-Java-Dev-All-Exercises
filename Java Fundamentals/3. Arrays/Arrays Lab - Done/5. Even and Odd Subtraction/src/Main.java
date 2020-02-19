/*
 * This console application was created by Svetozar Blazhev
 *
 * It is part of the Software University curriculum available
 * as exercises.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;
        int finalNum = 0;

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();

        for (int num : numbers){
            if (num == 0){
                continue;
            }
            else if (num % 2 == 0){
                evenSum+=num;
            }
            else{
                oddSum+=num;
            }
        }

        finalNum = evenSum - oddSum;
        System.out.println(finalNum);
    }
}
