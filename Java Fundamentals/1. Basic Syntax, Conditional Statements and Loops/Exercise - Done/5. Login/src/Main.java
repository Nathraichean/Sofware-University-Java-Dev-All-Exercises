/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init.
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        boolean lessThanFour = true;
        String username = scanner.nextLine();
        boolean correctPassword = false;
        char[] reverseUsernameTemp = username.toCharArray();
        char[] reverseUsernameArray = new char[reverseUsernameTemp.length];
        for (int i = 0; i < reverseUsernameTemp.length; i++) {
            reverseUsernameArray[i] = reverseUsernameTemp[reverseUsernameTemp.length-i-1];
        }
        String reverseUsername = String.copyValueOf(reverseUsernameArray);

        while (!correctPassword && lessThanFour){
            counter++;
            String password = scanner.nextLine();
            if (counter == 4){
                lessThanFour = false;
                System.out.printf("User %s blocked!", username);
            }
            else if (password.equals(reverseUsername)){
                System.out.printf("User %s logged in.", username);
                correctPassword = true;
            }
            else {
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}
