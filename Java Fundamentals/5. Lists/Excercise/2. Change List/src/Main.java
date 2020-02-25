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

        String init = scanner.nextLine();
        List<Integer> numbersList;

        if (init.equals("")){
            numbersList = new ArrayList<>();
        }
        else {
            numbersList =
                    Arrays.stream(init.split(" "))
                            .map(Integer::parseInt)
                            .collect(Collectors.toList());
        }


        boolean endCycle = false;

        while (!endCycle){

            String[] input = scanner.nextLine().split("\\s+");

            listManipulator(numbersList, input);

            if (input[0].equals("end")){
                System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
                endCycle = true;
            }
        }
    }

    public static void listManipulator(List<Integer> list, String[] input){
        switch (input[0]){
            case "Delete":
                while (list.contains(Integer.parseInt(input[1]))) list.remove((Object)Integer.parseInt(input[1]));
                break;
            case "Insert":
                if (list.size()==0){
                    list.add(Integer.parseInt(input[1]));
                }
                else if (list.size() > Integer.parseInt(input[2]) && Integer.parseInt(input[2]) >= 0)
                    list.add(Integer.parseInt(input[2]),Integer.parseInt(input[1]));
                break;
        }
    }
}

