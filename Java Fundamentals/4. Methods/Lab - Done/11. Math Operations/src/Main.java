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

        double a = Double.parseDouble(scanner.nextLine());
        char oper = scanner.nextLine().toCharArray()[0];
        double b = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", calculate(a,oper,b));

    }

    private static double calculate (double a, char oper, double b){

        double result = 0.00;

        switch (oper){
            case '*' :
                result = a*b;
                break;
            case '/' :
                result = a/b;
                break;
            case '+' :
                result = a+b;
                break;
            case '-' :
                result = a-b;
                break;
        }

        return result;

    }
}
