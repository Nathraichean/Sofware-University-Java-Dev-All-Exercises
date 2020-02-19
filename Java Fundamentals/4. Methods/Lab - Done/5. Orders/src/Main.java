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

        String item = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0.00;

        if (item.equals("coke")){
            price = 1.40;
        }
        else if (item.equals("water")){
            price = 1.00;
        }
        else if (item.equals("coffee")){
            price = 1.50;
        }
        else if (item.equals("snacks")){
            price = 2.00;
        }

        System.out.printf("%.2f", calculatePrice(price,quantity));
    }

    public static double calculatePrice(double price, int quantity){

        return price * quantity;

    }
}
