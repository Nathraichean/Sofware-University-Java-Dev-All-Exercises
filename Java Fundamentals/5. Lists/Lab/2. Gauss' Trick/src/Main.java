/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.text.DecimalFormat;
import java.util.ArrayList;
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

        List<Double> gaussNumbers = new ArrayList<>();

        int listSize = numbers.size();
        boolean evenOrOdd = false;

        int counter = listSize;

        if (listSize%2==0){
            evenOrOdd = true;
        }

        int halfListSize = 0;

        if (evenOrOdd){
            halfListSize = listSize/2;
        }
        else halfListSize = (listSize-1)/2;


        for (int i = 0; i < halfListSize; i++) {
            gaussNumbers.add(i, (numbers.get(i)+numbers.get(--listSize)));
        }
        if (!evenOrOdd){
            gaussNumbers.add(halfListSize, numbers.get(halfListSize));
        }

        System.out.println(joinElementsByDelimiter(gaussNumbers," "));

    }

    public static String joinElementsByDelimiter(List<Double> items, String delimiter){

        String output = "";

        for (Double item : items){
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        }

        return output;

    }

}
