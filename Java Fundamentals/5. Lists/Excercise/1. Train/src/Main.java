/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        List<Integer> trainWagons =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());

        boolean endCycle = false;

        while (!endCycle){

            String[] input = scanner.nextLine().split(" ");

            if (input.length == 2){
                if (input[0].equals("Add")) trainWagons.add(Integer.parseInt(input[1]));
            }
            else if (input.length == 1){
                if (input[0].equals("end")){
                    System.out.println(trainWagons.toString().replaceAll("[\\[\\],]", ""));
                    endCycle = true;
                }
                else{
                    int people = Integer.parseInt(input[0]);
                    boolean arePeopleOnWagon = false;

                    for (int wagon: trainWagons) {
                        if (wagon+people <= capacity && !arePeopleOnWagon){
                            trainWagons.set(trainWagons.indexOf(wagon), wagon+people);
                            arePeopleOnWagon = true;
                        }
                    }
                }
            }



        }
    }
}
