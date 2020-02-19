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

        String type = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int tempNum = 0;

        if (firstNum < secondNum){
            tempNum = firstNum;
            firstNum = secondNum;
            secondNum = tempNum;
            tempNum = 0;
        }

        if (type.equals("subtract")){
            System.out.println(subtract(firstNum,secondNum));
        }
        else if (type.equals("add")){
            System.out.println(add(firstNum,secondNum));
        }
        else if (type.equals("divide")){
            System.out.println(divide(firstNum,secondNum));
        }
        else if (type.equals("multiply")){
            System.out.println(multiply(firstNum,secondNum));
        }

    }

    public static int subtract(int a, int b){
        return a-b;
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int divide(int a, int b){
        return a/b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
}
