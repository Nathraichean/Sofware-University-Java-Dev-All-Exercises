/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition : Write program to enter n
 * numbers and calculate and print their
 * exact sum (without rounding).
 *
 */


import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal("0");

        for (int i = 0; i < input; i++) {
            BigDecimal num = new BigDecimal(scanner.nextLine());
            sum = sum.add(num);
        }

        System.out.println(sum);

    }
}
