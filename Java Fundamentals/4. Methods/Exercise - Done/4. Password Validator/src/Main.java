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

        String input = scanner.nextLine();

        if (checkDigitsCount(input) && checkForSymbols(input) && checkPasswordLength(input)){
            System.out.println("Password is valid");
        }
        else {
            if (!checkPasswordLength(input)){
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!checkForSymbols(input)){
                System.out.println("Password must consist only of letters and digits");
            }
            if (!checkDigitsCount(input)){
                System.out.println("Password must have at least 2 digits");
            }

        }
    }

    public static boolean checkPasswordLength(String password){
        if (password.length() > 5 && password.length() < 11) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean checkForSymbols(String password){

        boolean hasSymbols = false;
        char[] passwordArray = password.toCharArray();

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(passwordArray[i]) || Character.isDigit(passwordArray[i])){}
            else {hasSymbols = true;}
        }

        if (hasSymbols){
            return false;
        }
        return true;
    }

    public static boolean checkDigitsCount(String password){

        int counter = 0;

        char[] passwordArray = password.toCharArray();

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(passwordArray[i])) {
                counter++;
            }
        }

        if (counter >= 2 ) return true;
        else {
            return false;
        }

    }
}
