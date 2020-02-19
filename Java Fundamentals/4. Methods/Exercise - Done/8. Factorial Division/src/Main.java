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

        double a = Integer.parseInt(scanner.nextLine());
        double b = Integer.parseInt(scanner.nextLine());
        double temp = 0;

        if (a == 0){ a=1; }
        if (b == 0)b=1;

        double factorialDivision;


        factorialDivision  = calculateFactorial(a)/calculateFactorial(b);

        if (a < 0 || b < 0) System.out.println("0.00");
        else System.out.printf("%.2f", factorialDivision);



    }

    public static double calculateFactorial(double num){

        double sum = 1;

        for (int i = 1; i <= num; i++) {
            sum = sum * i;
        }

        return sum;

    }
}
