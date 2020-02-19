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

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input; i++) {

            if(checkNumber(i)) System.out.println(i);;

        }
    }

    public static boolean checkNumber(int n){

        char[] nArray = String.valueOf(n).toCharArray();

        int sumOfDigits = 0;

        boolean isDigitOdd = false;

        if (nArray.length>1){
            for (int i = 0; i < nArray.length; i++) {
                if (Integer.parseInt(String.valueOf(nArray[i]))%2==1){
                    isDigitOdd = true;
                }
                sumOfDigits += Integer.parseInt(String.valueOf(nArray[i]));
            }
        }

        if (sumOfDigits%8==0 && isDigitOdd){
            return true;
        }
        else return false;

    }
}
