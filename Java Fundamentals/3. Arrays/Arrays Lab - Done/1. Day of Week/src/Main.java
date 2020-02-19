/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition : Enter a day number [1…7]
 * and print the day name (in English)
 * or "Invalid day!". Use an array of strings
 *
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        String[] week = {"Invalid Day!", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int n = Integer.parseInt(scanner.nextLine());

        if (n < 8 && n > 0){
            System.out.println(week[n]);
        }
        else System.out.println("Invalid Day!");


    }
}
