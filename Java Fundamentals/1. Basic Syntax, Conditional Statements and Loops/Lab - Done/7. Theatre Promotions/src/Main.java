/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Init
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        if (age >= 0 && age <= 18){
            if (typeOfDay.equals("Weekday")){
                System.out.println("12$");
            }
            else if (typeOfDay.equals("Weekend")){
                System.out.println("15$");
            }
            else if (typeOfDay.equals("Holiday")){
                System.out.println("5$");
            }
            else {
                System.out.println("Error!");
            }
        }
        else if (age > 18 && age <= 64){
            if (typeOfDay.equals("Weekday")){
                System.out.println("18$");
            }
            else if (typeOfDay.equals("Weekend")){
                System.out.println("20$");
            }
            else if (typeOfDay.equals("Holiday")){
                System.out.println("12$");
            }
            else {
                System.out.println("Error!");
            }
        }
        else if (age > 64 && age <= 122){
            if (typeOfDay.equals("Weekday")){
                System.out.println("12$");
            }
            else if (typeOfDay.equals("Weekend")){
                System.out.println("15$");
            }
            else if (typeOfDay.equals("Holiday")){
                System.out.println("10$");
            }
            else {
                System.out.println("Error!");
            }
        }
        else{
            System.out.println("Error!");
        }
    }
}
