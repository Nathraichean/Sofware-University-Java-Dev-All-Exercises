/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition : A number is special when its
 * sum of digits is 5, 7 or 11.
 *
 * Write a program to read an integer n
 * and for all numbers in the range 1…n
 * to print the number and if it is special
 * or not (True / False).
 *
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int digitSum = 0;
        boolean special = false;

        for (int i = 1; i <= n; i++) {
            char[] charArray = String.valueOf(i).toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                digitSum += Integer.parseInt(String.valueOf(charArray[j]));
            }

            if (digitSum == 5 || digitSum == 7 || digitSum == 11){
                special = true;
            }

            if (special){
                System.out.printf("%d -> True\n", i);
            }
            else {
                System.out.printf("%d -> False\n", i);
            }

            digitSum = 0;
            special = false;
        }

    }
}
