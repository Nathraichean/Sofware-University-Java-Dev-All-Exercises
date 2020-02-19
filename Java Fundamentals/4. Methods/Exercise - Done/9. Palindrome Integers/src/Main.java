/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        boolean end = false;

        while (!end){

            String input = scanner.nextLine();

            boolean isPalindrome = true;

            if (input.equals("END")){
                end = true;
                continue;
            }

            char[] inputArray = input.toCharArray();

            int inputHalfLength = input.length()/2;

            char[] tempArray1 = new char[inputHalfLength+2];
            char[] tempArray2 = new char[inputHalfLength+2];
            int counter = 0;

            for (int i = 0; i < inputHalfLength; i++) {
                tempArray1[i] = inputArray[i];
            }
            for (int i = inputArray.length-1; i >= inputArray.length-inputHalfLength; i--) {
                tempArray2[counter++] = inputArray[i];
            }
            for (int i = 0; i < inputHalfLength; i++) {
                if (tempArray1[i] != tempArray2[i]){
                    isPalindrome = false;
                }
            }

            System.out.println(isPalindrome);

        }

    }
}
