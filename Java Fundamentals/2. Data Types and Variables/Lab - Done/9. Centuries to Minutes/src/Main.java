/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 */


import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int years = input*100;
        int days = (int)(years * 365.2422);
        int hours = days * 24;
        int minutes = hours * 60;



        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",
                            input, years, days, hours, minutes);
    }
}
