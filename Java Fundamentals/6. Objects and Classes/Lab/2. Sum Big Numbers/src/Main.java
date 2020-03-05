/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        BigInteger numberA = new BigInteger(scanner.nextLine());
        BigInteger numberB = new BigInteger(scanner.nextLine());

        BigInteger sum = numberA.add(numberB);

        System.out.println(sum);

    }
}
