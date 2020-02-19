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

        String input = scanner.nextLine();

        printMiddleChars(input);

    }

    public static void printMiddleChars(String input){

        boolean isMiddleDouble = false;
        int inputHalfLength = input.length()/2-1;
        int inputHalfLengthPlus = input.length()/2;

        if (input.length()%2 == 0){
            isMiddleDouble = true;
        }

        char[] inputArray = input.toCharArray();

        if (input.length() == 1) {
            System.out.println(inputArray[0]);
        }
        else{
            if (isMiddleDouble){
                System.out.println(inputArray[inputHalfLength] + "" + inputArray[inputHalfLengthPlus]);
            }
            else{
                System.out.println(inputArray[inputHalfLengthPlus]);
            }
        }

    }
}
