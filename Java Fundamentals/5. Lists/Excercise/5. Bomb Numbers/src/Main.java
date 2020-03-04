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

        List<Integer> field =
                Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String[] bomb = scanner.nextLine().split(" ");
        int sumUnexploded = 0;

        int bombIndex = Integer.parseInt(bomb[0]);
        int bombSplash = Integer.parseInt(bomb[1]);

        ArrayList<Integer> explodedIndexesList = new ArrayList<>();

        int indexCounter = 0;

        for (int coordinate : field) {
            int currentIndex = indexCounter;
            int fieldSize = field.size();

            if (coordinate == bombIndex) {
                for (int i = currentIndex; i <= currentIndex+bombSplash; i++) {
                    if (i < fieldSize)
                        explodedIndexesList.add(i);
                }
                for (int i = currentIndex; i >= currentIndex-bombSplash; i--){
                    if (i >= 0)
                        explodedIndexesList.add(i);
                }
            }
            indexCounter++;
        }

        indexCounter = 0;

        for (int index:field) {
            if (!explodedIndexesList.contains(indexCounter)){
                sumUnexploded+=index;
            }
            indexCounter++;
        }

        System.out.println(sumUnexploded);

    }
}
