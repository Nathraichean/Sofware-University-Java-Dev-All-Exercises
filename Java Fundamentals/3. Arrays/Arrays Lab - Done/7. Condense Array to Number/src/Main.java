/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition : Write a program to read an array of
 * integers and condense them by summing adjacent
 * couples of elements until a single integer is obtained.
 * For example, if we have 3 elements {2, 10, 3}, we
 * sum the first two and the second two elements and
 * obtain {2+10, 10+3} = {12, 13}, then we sum again all
 * adjacent elements and obtain {12+13} = {25}.
 *
 */


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] temporaryArray = input;

        boolean end = false;

        while (!end){

            if (temporaryArray.length == 1){
                end=true;
                System.out.println(temporaryArray[0]);
            }
            else{
                int[] condensedArray = new int[temporaryArray.length-1];

                for (int i = 0; i < temporaryArray.length-1; i++) {
                    condensedArray[i] = temporaryArray[i] + temporaryArray[i+1];
                }

                temporaryArray = condensedArray;
            }
        }
    }
}
