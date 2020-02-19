/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition : Write a method that receives
 * a single string and prints the count of the vowels.
 * Use appropriate name for the method.
 *
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(getNumberOfVowelsFromString(input));
    }

    public static int getNumberOfVowelsFromString(String word){

        char[] wordArray = word.toLowerCase().toCharArray();
        int counter = 0;

        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i] == 'a' || wordArray[i] == 'e' || wordArray[i] == 'o' ||
                    wordArray[i] == 'u' || wordArray[i] == 'i' || wordArray[i] == 'y'){
                counter++;
            }
        }

        return counter;
    }
}
