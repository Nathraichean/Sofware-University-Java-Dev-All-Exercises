/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers =
                Arrays.stream(scanner.nextLine().split(" "))
                        .map(Double::parseDouble)
                        .collect(Collectors.toList());

        for (int i = 0; i < numbers.size()-1; i++) {

            if (numbers.get(i).equals(numbers.get(i+1))) {

                numbers.set(i, (numbers.get(i) + numbers.get(i+1)));
                numbers.remove(i+1);
                i = -1;

            }

        }

        System.out.println(joinElementsByDelimiter(numbers, " "));
    }

    public static String joinElementsByDelimiter(List<Double> items, String delimiter){

        String output = "";

        for (Double item : items){
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        }

        return output;

    }
}
