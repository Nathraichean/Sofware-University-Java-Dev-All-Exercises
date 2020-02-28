/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        List<String> partyList = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            if (input[1].equals("is") && input[2].equals("going!")){

                if (!partyList.contains(input[0])){
                    partyList.add(input[0]);
                }
                else System.out.println(input[0] + " is already in the list!");
            }
            else if (input[1].equals("is") && input[2].equals("not")){
                if (partyList.contains(input[0])){
                    partyList.remove(input[0]);
                }
                else System.out.println(input[0] + " is not in the list!");
            }
        }

        for (String name: partyList) {
            System.out.println(name);
        }

    }
}
