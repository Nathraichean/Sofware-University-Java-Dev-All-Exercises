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

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int trips = 0;

        if (people % capacity == 0){
            trips = people/capacity;
        }
        else trips = people/capacity + 1;

        System.out.println(trips);
    }
}
