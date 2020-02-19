/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 * You are given two values of the same type as input.
 * The values can be of type int, char of String. Create
 * a method getMax() that returns the greater of the two values
 *
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        if (type.equals("int")){

            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());

            getMax(a,b);

        }
        else if (type.equals("char")){

            char a = scanner.nextLine().toCharArray()[0];
            char b = scanner.nextLine().toCharArray()[0];

            getMax(a,b);

        }
        else if (type.equals("String") || type.equals("string")){

            String a = scanner.nextLine();
            String b = scanner.nextLine();

            getMax(a,b);

        }



    }

    public static void getMax(int a, int b){
        if (a > b){
            System.out.println(a);
        }
        else System.out.println(b);
    }
    public static void getMax(char a, char b){
        if (a > b){
            System.out.println(a);
        }
        else System.out.println(b);
    }
    public static void getMax(String a, String b){
        if (a.compareTo(b) > 0){
            System.out.println(a);
        }
        else System.out.println(b);
    }

}
