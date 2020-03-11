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

        int numOfStudents = Integer.parseInt(scanner.nextLine());
        ArrayList<Student> studentList = new ArrayList<>();

        for (int i = 0; i < numOfStudents; i++) {

            String[] studentInput = scanner.nextLine().split("\\s+");
            studentList.add(new Student(studentInput[0],studentInput[1],Double.parseDouble(studentInput[2])));
        }

        studentList.stream()
                    .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                    .forEach(student -> System.out.printf("%s %s: %.2f\n",student.getFirstName(),student.getLastName(),student.getGrade()));

    }

    public static class Student{
        private String firstName;
        private String lastName;
        private double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public double getGrade() {
            return grade;
        }
        public void setGrade(double grade) {
            this.grade = grade;
        }
    }
}

