/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        if (!input.equals("")){
            String[] arrays = input.split("\\|");
            if (true){
                ArrayList<Integer> finalList = new ArrayList<>();

                for (int i = arrays.length-1; i >= 0 ; i--) {

                    String[] currentArray = arrays[i].trim().split("\\s+");

                    for (String item: currentArray) {
                        try {
                            finalList.add(Integer.parseInt(item));
                        }
                        catch (NumberFormatException e){
                            System.out.println("");
                        }
                    }

                }

                for (int num: finalList) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
