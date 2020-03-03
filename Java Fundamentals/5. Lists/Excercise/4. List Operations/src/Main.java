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
                Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        boolean cycle = true;

        while (cycle){


            String inputA = scanner.nextLine();
            String[] input = inputA.split("\\s+");

            if (inputA.equals("End")){
                for (int num: numbers) {
                    System.out.print(num + " ");
                }
                cycle = false;
            }
            else{
                input = inputA.split("\\s+");
                listManipulator(numbers,input);
            }




        }


    }

    public static void listManipulator(List<Integer> list, String[] input){

        switch (input[0]){

            case "Add":
                list.add(Integer.parseInt(input[1]));
                break;
            case "Remove":
                if (Integer.parseInt(input[1]) < list.size() && Integer.parseInt(input[1]) >= 0)
                    list.remove(Integer.parseInt(input[1]));
                else System.out.println("Invalid index");
                break;
            case "Insert":
                if (list.size() >= Integer.parseInt(input[2]) && Integer.parseInt(input[2]) >= 0)
                    list.add(Integer.parseInt(input[2]), Integer.parseInt(input[1]));
                else System.out.println("Invalid index");
                break;
            case "Shift":
                int counter = 1;
                if (input.length > 2){
                    counter = Integer.parseInt(input[2]);
                }

                if (list.size() > 1){
                    if (input[1].equals("left")){
                        for (int i = 0; i < counter; i++) {
                            list.add(list.get(0));
                            list.remove(0);
                        }
                    }
                    else if (input[1].equals("right")){
                        for (int i = 0; i < counter; i++) {
                            list.add(0, list.get(list.size()-1));
                            list.remove(list.size()-1);
                        }
                    }
                }
                break;
            case "print":
                for (int num: list) {
                    System.out.print(num + " ");
                }
                System.out.println();
                break;
        }


    }
}
