/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init.
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String day = scanner.nextLine();
        double sum = 0;

        if (typeOfPeople.equals("Students")){
            if (day.equals("Friday")){
                sum = 8.45 * people;
            }
            else if (day.equals("Saturday")){
                sum = 9.80 * people;
            }
            else if (day.equals("Sunday")){
                sum = 10.46 * people;
            }

            if (people >= 30){
                sum *= 0.85;
            }
        }
        else if (typeOfPeople.equals("Business")){
            if (day.equals("Friday")){
                sum = 10.90 * people;

                if (people >= 100){
                    sum -= 10*10.90;
                }
            }
            else if (day.equals("Saturday")){
                sum = 15.60 * people;

                if (people >= 100){
                    sum -= 10*15.60;
                }
            }
            else if (day.equals("Sunday")){
                sum = 16 * people;

                if (people >= 100){
                    sum -= 10*16;
                }
            }


        }
        else if (typeOfPeople.equals("Regular")){
            if (day.equals("Friday")){
                sum = 15 * people;
            }
            else if (day.equals("Saturday")){
                sum = 20 * people;
            }
            else if (day.equals("Sunday")){
                sum = 22.50 * people;
            }

            if (people >= 10 && people <= 20){
                sum *= 0.95;
            }
        }

        System.out.printf("Total price: %.2f", sum);
    }
}
