/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init.
        Scanner scanner = new Scanner(System.in);

        int factorialSum = 0;
        int tempSum = 0;
        String input = scanner.nextLine();
        int[] inputArray = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            inputArray[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
        }

        // Iterate every digit from the input
        for (int i = 0; i < inputArray.length; i++) {

            // Calc factorial for inputArray[i]
            for (int j = inputArray[i]; j >= 1; j--) {
                if (inputArray[i] == 1){
                    tempSum+= 1;
                }
                else if (j == inputArray[i]){
                    tempSum += j*(j-1);
                }
                else if (j == 1) {
                    tempSum*=j;
                }
                else {
                    tempSum*=j-1;
                }
            }
            if (inputArray[i] == 0){
                tempSum+= 1;
            }
            factorialSum+= tempSum;
            tempSum = 0;
        }

        if (factorialSum == Integer.parseInt(input)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
