/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Init
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if ((minutes + 30) > 59){
            hours+=1;
            minutes+=30;
            minutes-=60;
            if (hours == 24){
                hours = 0;
            }
            if (minutes < 10){
                System.out.println(hours + ":0" + minutes);
            }
            else{
                System.out.println(hours + ":" + minutes);
            }

        }
        else{
            if (hours == 24){
                hours = 0;
            }
            minutes+=30;
            if (minutes < 10){
                System.out.println(hours + ":0" + minutes);
            }
            else{
                System.out.println(hours + ":" + minutes);
            }
        }

    }
}
