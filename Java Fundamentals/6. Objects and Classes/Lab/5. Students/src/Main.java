/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> studentsList = new ArrayList<>();
        boolean end = false;

        while (!end){

            String[] input = scanner.nextLine().trim().split(" ");

            if (input[0].equals("end")){
                end = true;

                String hometown = scanner.nextLine();

                for (Student student:studentsList) {
                    if (student.getHomeTown().equals(hometown)){
                        System.out.printf("%s %s is %d years old\n",student.getFirstName(),student.getLastName(),student.getAge());
                    }
                }

            }
            else if (input.length == 4){
                Student student = new Student(input[0],input[1],Integer.parseInt(input[2]),input[3]);
                studentsList.add(student);
            }


        }

    }

}
