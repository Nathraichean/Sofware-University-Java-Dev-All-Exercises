/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        int sumOdd = 0;
        int sumEven = 0;

        char[] input = scanner.nextLine().toCharArray();

        if (input[0] == '-'){
            input = Arrays.copyOfRange(input, 1, input.length);
        }

        sumEven = getEvenSum(sumEven,input);
        sumOdd = getOddSum(sumOdd,input);
        multiplyOddEvenSums(sumOdd,sumEven);

    }

    public static int getEvenSum(int sumEven, char[] array){

        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(String.valueOf(array[i]))%2==0){
                sumEven+=Integer.parseInt(String.valueOf(array[i]));
            }
        }
        return sumEven;
    }
    public static int getOddSum(int sumOdd,char[] array){
        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(String.valueOf(array[i]))%2==1){
                sumOdd+=Integer.parseInt(String.valueOf(array[i]));
            }
        }
        return sumOdd;
    }
    public static void multiplyOddEvenSums(int odd, int even){
        System.out.println(odd*even);
    }
}
