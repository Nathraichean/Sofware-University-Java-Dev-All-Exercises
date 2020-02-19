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

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractFromSum(getSum(a,b),c));

    }

    public static int getSum(int a, int b){
        return a+b;
    }

    public static int subtractFromSum(int a, int b){
        return a-b;
    }
}
