/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        boolean cycle = true;

        while (cycle){


            String inputA = scanner.nextLine();
            String[] input = inputA.split(" ");

            if (inputA.equals("end")){
                for (int num: numbers) {
                    System.out.print(num + " ");
                }
                cycle = false;
            }

            listManipulator(numbers,input);


        }


    }

    public static void listManipulator(List<Integer> list, String[] input){

        switch (input[0]){

            case "Add":
                list.add(Integer.parseInt(input[1]));
                break;
            case "Remove":
                list.remove((Object)Integer.parseInt(input[1]));
                break;
            case "RemoveAt":
                list.remove(Integer.parseInt(input[1]));
                break;
            case "Insert":

                list.add(Integer.parseInt(input[2]), Integer.parseInt(input[1]));
                break;

        }


    }
}
