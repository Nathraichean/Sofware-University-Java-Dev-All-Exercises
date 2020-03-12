/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        LinkedHashMap<String,Integer> counts = new LinkedHashMap<>();
        ArrayList<String> odds = new ArrayList<>();

        for (String word : words) {
            if (counts.containsKey(word.toLowerCase())){
                counts.put(word.toLowerCase(), counts.get(word.toLowerCase())+1);
            }
            else {
                counts.put(word.toLowerCase(), 1);
            }
        }

        for (var entry : counts.entrySet()){
            if (entry.getValue() % 2 == 1) {
                odds.add(entry.getKey());
            }
        }

        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if (i < odds.size() - 1){
                System.out.print(", ");
            }
        }

    }
}
