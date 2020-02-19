/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition : Write a program, which prints
 * common elements in two arrays. You have to
 * compare the elements of the second array to
 * the elements of the first.
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
	    Scanner scanner = new Scanner(System.in);

	    String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");
        String[] arrayMatching = new String[20];

        int counter = 0;

        for (String e: array2) {
            for (String y : array1){
                if (y.equals(e)){
                    if (!Arrays.asList(arrayMatching).contains(y)) {
                        arrayMatching[counter++] = y;
                    }
                }
            }
        }


        for (String e : arrayMatching){
            if (e != null){
                System.out.print(e + " ");
            }
        }
    }
}
