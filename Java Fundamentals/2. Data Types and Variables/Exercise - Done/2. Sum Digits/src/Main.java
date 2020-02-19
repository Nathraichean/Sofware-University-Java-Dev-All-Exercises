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

        char[] input = scanner.nextLine().toCharArray();
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            sum +=Integer.parseInt(String.valueOf(input[i]));
        }

        System.out.println(sum);
    }
}
