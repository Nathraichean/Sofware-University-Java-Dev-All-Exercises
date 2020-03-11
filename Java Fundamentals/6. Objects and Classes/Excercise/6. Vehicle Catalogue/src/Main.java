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

        boolean end = false;
        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        while (true){

            String[] input = scanner.nextLine().split("\\s+");

            if (input[0].equals("End")){
                break;
            }
            else if (input.length == 4){
                vehicleList.add(new Vehicle(input[0],input[1],input[2],Integer.parseInt(input[3])));
            }
        }

        while (true){

            String input = scanner.nextLine();

            if (input.equals("Close the Catalogue")){

                double carHPSum = 0;
                double truckHPSum = 0;
                int carCounter = 0;
                int truckCounter = 0;

                for (Vehicle vehicle:vehicleList) {
                    if (vehicle.getType().equals("Car")){
                        carHPSum+=vehicle.getHorsePower();
                        carCounter++;
                    }
                    else if (vehicle.getType().equals("Truck")){
                        truckHPSum+=vehicle.getHorsePower();
                        truckCounter++;
                    }
                }

                if (carCounter==0){carCounter++;}
                if (truckCounter==0){truckCounter++;}

                System.out.printf("Cars have average horsepower of: %.2f.\n",carHPSum/carCounter);
                System.out.printf("Trucks have average horsepower of: %.2f.\n",truckHPSum/truckCounter);

                break;
            }
            else {
                for (Vehicle vehicle:vehicleList) {
                    if (vehicle.getModel().equals(input)){
                        System.out.print(vehicle.toString());
                    }
                }
            }


        }


    }

    public static class Vehicle {

        private String type;
        private String model;
        private String color;
        private int horsePower;

        public Vehicle(String type, String model, String color, int horsePower) {
            this.type = type.substring(0, 1).toUpperCase() + type.substring(1);
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }

        public String getModel() {
            return model;
        }
        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }

        public int getHorsePower() {
            return horsePower;
        }
        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %d\n",
                    this.getType(),this.getModel(),this.getColor(),this.getHorsePower());
        }
    }
}
