/**
 * Excercise done by Svetozar Blazhev
 * student of Software University
 *
 * Condition :
 *
 */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //init
        Scanner scanner = new Scanner(System.in);

        ArrayList<Person> peopleList = new ArrayList<>();

        while (true){
            String[] studentInput = scanner.nextLine().split("\\s+");

            if (studentInput[0].equals("End")){
                break;
            }

            peopleList.add(new Person(studentInput[0],studentInput[1],Integer.parseInt(studentInput[2])));
        }

        peopleList.stream()
                .sorted(Comparator.comparingDouble(Person::getAge))
                .forEach(person -> System.out.printf("%s with ID: %s is %d years old.\n",person.getFirstName(),person.getId(),person.getAge()));

    }

    public static class Person{
        private String firstName;
        private String id;
        private int age;

        public Person(String firstName, String id, int age) {
            this.firstName = firstName;
            this.id = id;
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }
}

