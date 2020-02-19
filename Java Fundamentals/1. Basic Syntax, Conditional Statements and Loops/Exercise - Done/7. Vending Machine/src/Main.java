/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init.
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        boolean cycle = true;
        boolean started = false;

        while (cycle){

            String input = scanner.nextLine();
            if (input.equals("Start")){
                started = true;
            }
            else if (!started){
                double doubleInput = Double.parseDouble(input);
                // Money check and sum add
                if (doubleInput == 0.1 || doubleInput == 0.2 || doubleInput == 0.5 || doubleInput == 1 || doubleInput == 2){
                    sum+=doubleInput;
                }
                else {
                    System.out.printf("Cannot accept %.02f", doubleInput);
                }
            }
            else{
                // Order check
                if (input.equals("Nuts")){
                    if (sum >= 2){
                        System.out.println("Purchased Nuts");
                        sum-=2;
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                }
                else if (input.equals("Water")){
                    if (sum >= 0.7){
                        System.out.println("Purchased Water");
                        sum-=0.7;
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                }
                else if (input.equals("Crisps")){
                    if (sum >= 1.5){
                        System.out.println("Purchased Crisps");
                        sum-=1.5;
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                }
                else if (input.equals("Soda")){
                    if (sum >= 0.8){
                        System.out.println("Purchased Soda");
                        sum-=0.8;
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                }
                else if (input.equals("Coke")){
                    if (sum >= 1){
                        System.out.println("Purchased Coke");
                        sum-=1;
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                }
                else if (input.equals("End")){
                    cycle = false;
                    System.out.printf("Change: %.02f", sum);
                }
                else {
                    System.out.println("Invalid product");
                }
            }
        }

    }
}
