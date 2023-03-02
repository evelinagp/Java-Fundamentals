package ObjectsAndClasses6.MoreEx;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CarSalesmanME03 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<Engine1> engineList = new LinkedHashSet<>();

        Engine1 engine;
        String engineModel;
        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            engineModel = input[0];
            String power = input[1];
            String efficiency = "n/a";
            String displacements = "n/a";

            if (input.length == 3) {
                if (input[2].charAt(0) >= 65 && input[2].charAt(0) <= 90) {
                    efficiency = input[2];
                } else {
                    displacements = input[2];
                }
            } else if (input.length == 4) {
                if (input[2].charAt(0) >= 65 && input[2].charAt(0) <= 90) {
                    efficiency = input[2];
                    displacements = input[3];
                } else {
                    displacements = input[2];
                    efficiency = input[3];
                }
            }

            engine = new Engine1(engineModel, power, displacements, efficiency);
            engineList.add(engine);
        }
        Car car;
        LinkedHashSet<Car> carList = new LinkedHashSet<>();
        int m = Integer.parseInt(scanner.nextLine());
        while (m-- > 0) {

            String[] input = scanner.nextLine().split("\\s+");
            String carModel = input[0];
            engineModel = input[1];
            String color = "n/a";
            String weight = "n/a";
            if (input.length == 3) {
                if (input[2].charAt(0) >= 65 && input[2].charAt(0) <= 90) {
                    color = input[2];
                } else {
                    weight = input[2];
                }
            } else if (input.length == 4) {
                if (input[2].charAt(0) >= 65 && input[2].charAt(0) <= 90) {
                    color = input[2];
                    weight = input[3];
                } else {
                    weight = input[2];
                    color = input[3];
                }
            }

//            car = new Car(carModel, engineModel, weight, color);
//            carList.add(car);

//            System.out.println(car.toString());
        }
    }

    public static class Car {
        private String carModel;
        private Engine1 engineModel;
        ;
        private String weight;
        private String color;

        public String getCarModel() {
            return carModel;
        }

        public Engine1 getEngine() {
            return this.engineModel;
        }

        public String getWeight() {
            return weight;
        }

        public String getColor() {
            return color;
        }

        public Car(String carModel, Engine1 engineModel, String weight, String color) {
            this.carModel = carModel;
            this.engineModel = engineModel;
            this.weight = weight;
            this.color = color;
        }

        @Override
        public String toString() {
            return this.carModel + ":" + "\n" + String.format("%s" +
                    "  Weight: %s%n" +
                    "  Color: %s", this.engineModel, this.weight, this.color);
        }
    }

    public static class Engine1 {
        private String engineModel;
        private String power;
        private String displacements;
        private String efficiency;

        public Engine1(String engineModel, String power, String displacements, String efficiency) {
            this.engineModel = engineModel;
            this.power = power;
            this.displacements = displacements;
            this.efficiency = efficiency;
        }

        public String getEngineModel() {
            return engineModel;
        }

        public String getPower() {
            return power;
        }

        public String getDisplacements() {
            return displacements;
        }

        public String getEfficiency() {
            return efficiency;
        }

        @Override
        public String toString() {
            return "  " + this.engineModel + ":" + "\n" + String.format(
                    "    Power: %s%n" +
                            "    Displacement: %s%n" +
                            "    Efficiency: %s%n", this.power, this.displacements, this.efficiency);
        }
    }
}


