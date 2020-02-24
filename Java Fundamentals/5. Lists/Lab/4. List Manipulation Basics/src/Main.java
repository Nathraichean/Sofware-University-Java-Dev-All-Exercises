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
            case "Contains":
                if (list.contains(Integer.parseInt(input[1])))System.out.println("Yes");
                else System.out.println("No such number");
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
            case "Print":
                if (input[1].equals("even")){
                    for (int num: list) {
                        if (num%2==0){
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();
                }
                else {
                    for (int num: list) {
                        if (num%2>0){
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();
                }
                break;
            case "Get":
                if (input[1].equals("sum")){
                    int sum = 0;
                    for (int num : list) {
                        sum+=num;
                    }
                    System.out.println(sum);
                }
                break;
            case "Filter":
                if (input[1].equals(">=")){
                    for (int num: list) {
                        if (num >= Integer.parseInt(input[2])){
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();
                }
                else if (input[1].equals("<=")){
                    for (int num: list) {
                        if (num <= Integer.parseInt(input[2])){
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();
                }
                else if (input[1].equals(">")){
                    for (int num: list) {
                        if (num > Integer.parseInt(input[2])){
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();
                }
                else if (input[1].equals("<")){
                    for (int num: list) {
                        if (num < Integer.parseInt(input[2])){
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();
                }
        }


    }
}
