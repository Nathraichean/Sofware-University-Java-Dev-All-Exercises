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

        double height = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double area = calculateRectangleArea(height,width);

        System.out.println((int)area);
    }

    public static double calculateRectangleArea(double height, double width){

        return height*width;

    }
}
