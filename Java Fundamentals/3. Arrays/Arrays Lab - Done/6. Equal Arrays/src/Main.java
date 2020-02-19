/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition : Read two arrays and print on the console whether
 * they are identical or not. Arrays are identical if their elements
 * are equal. If the arrays are identical find the sum of the first
 * one and print on the console following message: "Arrays are identical.
 * Sum: {sum}", otherwise find the first index where the arrays differ
 * and print on the console following message: "Arrays are not identical.
 * Found difference at {index} index."
 *
 */


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        int[] array1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] array2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int arrayNumSum = 0;
        int maxLength = 0;

        boolean identical = true;

        if (array1.length >= array2.length){
            maxLength = array2.length;
        }
        else maxLength = array1.length;

        for (int i = 0; i < maxLength; i++) {
            arrayNumSum+=array1[i];
            if (array1[i] != array2[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                identical = false;
                break;
            }
        }

        if (identical){
            System.out.printf("Arrays are identical. Sum: %d", arrayNumSum);
        }
    }
}
