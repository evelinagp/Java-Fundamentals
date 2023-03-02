package ObjectsAndClasses6.MoreEx;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CarSalesmanME033 {

    public static class Car {

        private String model;
        private String engine;
        private String weight;
        private String color;

        public Car(String model, String engine, String weight, String color) {
            this.model = model;
            this.engine = engine;
            this.weight = weight;
            this.color = color;
        }

        public String getModel() {
            return model;
        }

        public String getEngine() {
            return engine;
        }

        public String getWeight() {
            return weight;
        }

        public String getColor() {
            return color;
        }
        public String toString (){
            return String.format("%s:%n" + "%s%n" + "Weight: %s%n, Color: %s%n", this.model, this.engine,this.weight, this.color);
        }
    }

    public static class Engine {
        private String engineModel;
        private int enginePower;
        private String engineDisplacement;
        private String engineEfficiency;

        public Engine(String engineModel, int enginePower, String engineDisplacement, String engineEfficiency) {
            this.engineModel = engineModel;
            this.enginePower = enginePower;
            this.engineDisplacement = engineDisplacement;
            this.engineEfficiency = engineEfficiency;
        }

        public String getEngineModel() {
            return engineModel;
        }

        public int getEnginePower() {
            return enginePower;
        }

        public String getEngineDisplacement() {
            return engineDisplacement;
        }

        public String getEngineEfficiency() {
            return engineEfficiency;
        }
        public String toString (){
            return String.format("%s:%n" + "Power: %d%n" + "Displacement: %s%n" + "Efficiency: %s%n",
                    this.engineModel, this.enginePower, this.engineDisplacement, this.engineEfficiency);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<Engine> enginesList = new LinkedHashSet<>();
        LinkedHashSet<Car> carsList = new LinkedHashSet<>();

        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String engineModel = input[0];
            int enginePower = Integer.parseInt(input[1]);
            String engineDisplacement = "n/a";
            String engineEfficiency = "n/a";
            if (input.length == 3) {
                if (input[2].charAt(0) >= 65 && input[2].charAt(0) <= 90) {
                    engineEfficiency = input[2];
                } else {
                    engineDisplacement = input[2];
                }
            } else if (input.length == 4) {
                engineDisplacement = input[2];
                engineEfficiency = input[3];
            }
        Engine engine = new Engine(engineModel, enginePower, engineDisplacement, engineEfficiency);
        enginesList.add(engine);
        }
        int m = Integer.parseInt(scanner.nextLine());
        while (m-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String carModel = input[0];
            String engineModel = input[1];
            String weight = "n/a";
            String color = "n/a";

            if (input.length == 3) {
                if (Character.isDigit(input[2].charAt(0))){
                    weight = input[2];
                } else {
                    color = input[2];
                }
            } else if (input.length == 4) {
                weight = input[2];
                color = input[3];
            }
            Car car = new Car(carModel, engineModel, weight, color);
            carsList.add(car);
        }
//       carsList.stream().
    }
}



