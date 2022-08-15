package ObjectsAndClasses6;

import java.util.*;

public class CarSalesmanME032 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<Engine1>> engineParameters = new HashMap<>();
        int length = 0;
        int countEngines = Integer.parseInt(scan.nextLine());
        boolean hasNumber;
        for (int i = 0; i < countEngines; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            String engineModel = tokens[0];
            String power = tokens[1];
            String displacement = "n/a";
            String efficiency = "n/a";

            length = tokens.length;
            if (length == 3) {
                String current = tokens[2];
                hasNumber = checkForNumbers(current);
                if (hasNumber) {
                    displacement = current;
                } else {
                    efficiency = current;
                }
            }

            if (length > 3) {
                displacement = tokens[2];
                efficiency = tokens[3];
            }

            Engine1 currentEngine = new Engine1(engineModel, power, displacement, efficiency);
            engineParameters.putIfAbsent(engineModel, new ArrayList<>());
            engineParameters.get(engineModel).add(currentEngine);
        }


        Map<Integer, List<Car1>> carParameters = new LinkedHashMap<>();

        int quantityCars = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < quantityCars; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            String model = tokens[0];
            String engine = tokens[1];
            String weight = "n/a";
            String color = "n/a";
            length = tokens.length;
            if (length == 3) {
                String current = tokens[2];
                hasNumber = checkForNumbers(current);
                if (hasNumber) {
                    weight = current;
                } else {
                    color = current;
                }
            }

            if (length == 4) {
                weight = tokens[2];
                color = tokens[3];
            }

            Engine1 enginePerThisCar = getParticularEngine(engine, engineParameters);
            Car1 currentCar = new Car1(model, enginePerThisCar, weight, color);
            int position = i;
            carParameters.putIfAbsent(position, new ArrayList<>());
            carParameters.get(position).add(currentCar);
        }


        for (Map.Entry<Integer, List<Car1>> currentElement : carParameters.entrySet()) {
            currentElement.getValue().stream().forEach(f -> {
                System.out.println(String.format("%s:" + "\n" + "  %s:\n" +
                                "    Power: %s\n" +
                                "    Displacement: %s\n" +
                                "    Efficiency: %s\n" +
                                "  Weight: %s\n" +
                                "  Color: %s", f.getModel(),
                        f.getEngine().getEngineModel(),
                        f.getEngine().getPower(),
                        f.getEngine().getDisplacement(),
                        f.getEngine().getEfficiency(),
                        f.getWeight(), f.getColor()));
            });
        }

//        for (List<Car1> value : carParameters.values()) {
//            System.out.println(value.
//                    toString().replace("[", "")
//                    .replace("]", "")
//                    .replace("=", ":"));
//        }
    }

    private static Engine1 getParticularEngine(String engine, Map<String, List<Engine1>> engineParameters) {
        List<Engine1> temp = new ArrayList<>();
        Engine1 engine1;
        for (Map.Entry<String, List<Engine1>> element : engineParameters.entrySet()) {
            String modelCurrent = element.getKey();
            if (modelCurrent.equals(engine)) {
                String specificModel = element
                        .getValue().get(0).getEngineModel();
                String power = element.getValue().get(0).getPower();
                String displacement = element.getValue().get(0).getDisplacement();
                String efficiency = element.getValue().get(0).getEfficiency();
                return engine1 = new Engine1(specificModel, power, displacement, efficiency);
            }
        }
        return null;
    }

    private static boolean checkForNumbers(String current) {
        for (int i = 0; i < current.length(); i++) {
            int ascii = current.charAt(i);
            if (ascii > 47 && ascii < 58) {
                return true;
            }
        }
        return false;
    }

    public static class Engine1 {


        public String getEfficiency() {
            return this.efficiency;
        }

        public String getDisplacement() {
            return this.displacement;
        }

        public String getPower() {
            return this.power;
        }

        public String getEngineModel() {
            return this.engineModel;
        }

        public Engine1(String engineModel, String power, String displacement, String efficiency) {
            this.engineModel = engineModel;
            this.power = power;
            this.displacement = displacement;
            this.efficiency = efficiency;
        }

        @Override
        public String toString() {
            return "  " + this.engineModel + ":" + "\n" + String.format(
                    "    Power: %s%n" +
                            "    Displacement: %s%n" +
                            "    Efficiency: %s%n", this.power, this.displacement, this.efficiency);
        }

        private String engineModel;
        private String power;
        private String displacement;
        private String efficiency;

    }
    public static class Car1 {


        public String getColor() {
            return this.color;
        }

        public String getWeight() {
            return this.weight;
        }

        public Engine1 getEngine() {
            return this.engine;
        }

        public String getModel() {
            return this.model;
        }

        public Car1(String model, Engine1 engine, String weight, String color) {
            this.model = model;
            this.engine = engine;
            this.weight = weight;
            this.color = color;
        }

        private String model;
        private Engine1 engine;
        private String weight;
        private String color;

        @Override
        public String toString() {
            return this.model + ":" +"\n"+ String.format("%s" +
                    "  Weight: %s%n" +
                    "  Color: %s",this.engine,this.weight,this.color);
        }
    }
}
