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

        double input = Double.parseDouble(scanner.nextLine());
        checkGrade(input);

    }

    public static void checkGrade(double grade){
        if (grade <= 2.99){
            System.out.println("Fail");
        }
        else if (grade >= 3.00 && grade <= 3.49){
            System.out.println("Poor");
        }
        else if (grade >= 3.50 && grade <= 4.49){
            System.out.println("Good");
        }
        else if (grade >= 4.50 && grade <= 5.49){
            System.out.println("Very good");
        }
        else if (grade >= 5.50){
            System.out.println("Excellent");
        }
    }
}
