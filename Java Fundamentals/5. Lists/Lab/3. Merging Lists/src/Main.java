/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersA =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> numbersB =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        if (numbersA.size() > numbersB.size()){

            for (int i = 0; i < numbersB.size(); i++) {
                resultList.add(numbersA.get(i));
                resultList.add(numbersB.get(i));
            }

            for (int i = numbersB.size(); i < numbersA.size(); i++) {
                resultList.add(numbersA.get(i));
            }

        }
        else if (numbersA.size() < numbersB.size()){

            for (int i = 0; i < numbersA.size(); i++) {
                resultList.add(numbersA.get(i));
                resultList.add(numbersB.get(i));
            }

            for (int i = numbersA.size(); i < numbersB.size(); i++) {
                resultList.add(numbersB.get(i));
            }

        }
        else {

            for (int i = 0; i < numbersA.size(); i++) {
                resultList.add(numbersA.get(i));
                resultList.add(numbersB.get(i));
            }

        }

        for (int number: resultList) {
            System.out.print(number + " ");
        }
    }
}
