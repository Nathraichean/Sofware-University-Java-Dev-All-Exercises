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

        List<Integer> firstDeck =
                Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> secondDeck =
                Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int counter = 0;

        while (!firstDeck.isEmpty() && !secondDeck.isEmpty() && counter < 100){

            if (firstDeck.get(0) > secondDeck.get(0)){
                firstDeck.add(firstDeck.get(0));
                firstDeck.add(secondDeck.get(0));
                firstDeck.remove(0);
                secondDeck.remove(0);
            }
            else if (firstDeck.get(0) < secondDeck.get(0)) {
                secondDeck.add(secondDeck.get(0));
                secondDeck.add(firstDeck.get(0));
                secondDeck.remove(0);
                firstDeck.remove(0);
            }
            else {
                firstDeck.remove(0);
                secondDeck.remove(0);
            }

            counter++;
        }
        int sum = 0;
        int winner = 0;


        if (secondDeck.isEmpty()) {
            for (int card:firstDeck) {
                sum+=card;
            }
            winner = 1;
        }
        else if (firstDeck.isEmpty()){
            for (int card:secondDeck) {
                sum+=card;
            }
            winner = 2;
        }

        if (winner==1) System.out.println("First player wins! Sum: " + sum);
        if (winner==2) System.out.println("Second player wins! Sum: " + sum);

    }
}
