/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.util.Arrays;
import java.util.Collections;
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

        numbers.removeIf(n -> n<0);

        Collections.reverse(numbers);

        if (numbers.isEmpty()){
            System.out.println("empty");
        }
        else {
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }

    }
}
