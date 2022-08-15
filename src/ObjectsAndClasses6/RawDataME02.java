package ObjectsAndClasses6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RawDataME02 {

    static class Car {

        String model;
        List<Engine> engines;
        List<Cargo> cargos;
        List<Tires> tires;

        public void setModel(String model) {
            this.model = model;
        }

        public void setEngines(List<Engine> engines) {
            this.engines = engines;
        }

        public void setCargos(List<Cargo> cargos) {
            this.cargos = cargos;
        }

        public void setTires(List<Tires> tires) {
            this.tires = tires;
        }

        public String getModel() {
            return model;
        }

        public List<Engine> getEngines() {
            return engines;
        }

        public List<Cargo> getCargos() {
            return cargos;
        }

        public List<Tires> getTires() {
            return tires;
        }

        public Car(String model, List<Engine> engines, List<Cargo> cargos, List<Tires> tires) {
            this.model = model;
            this.engines = engines;
            this.cargos = cargos;
            this.tires = tires;
        }

        public String toString() {
            return String.format("%s %d %d %d %s %.1f %d %.1f %d %.1f %d %.1f %d", getModel(), getEngines(), getCargos(), getTires());
        }
    }


    static class Engine {
        int engineSpeed;
        int enginePower;

        public void setEngineSpeed(int engineSpeed) {
            this.engineSpeed = engineSpeed;
        }

        public void setEnginePower(int enginePower) {
            this.enginePower = enginePower;
        }

        public int getEngineSpeed() {
            return engineSpeed;
        }

        public int getEnginePower() {
            return enginePower;
        }

        public Engine(int engineSpeed, int enginePower) {
            this.engineSpeed = engineSpeed;
            this.enginePower = enginePower;
        }

    }

    static class Cargo {
        int cargoWeight;
        String cargoType;

        public void setCargoWeight(int cargoWeight) {
            this.cargoWeight = cargoWeight;
        }

        public void setCargoType(String cargoType) {
            this.cargoType = cargoType;
        }

        public int getCargoWeight() {
            return cargoWeight;
        }

        public String getCargoType() {
            return cargoType;
        }

        public Cargo(int cargoWeight, String cargoType) {
            this.cargoWeight = cargoWeight;
            this.cargoType = cargoType;
        }
    }

    static class Tires {
        double tire1Pressure;
        int tire1Age;
        double tire2Pressure;
        int tire2Age;
        double tire3Pressure;
        int tire3Age;
        double tire4Pressure;
        int tire4Age;

        public void setTire1Pressure(double tire1Pressure) {
            this.tire1Pressure = tire1Pressure;
        }

        public void setTire1Age(int tire1Age) {
            this.tire1Age = tire1Age;
        }

        public void setTire2Pressure(double tire2Pressure) {
            this.tire2Pressure = tire2Pressure;
        }

        public void setTire2Age(int tire2Age) {
            this.tire2Age = tire2Age;
        }

        public void setTire3Pressure(double tire3Pressure) {
            this.tire3Pressure = tire3Pressure;
        }

        public void setTire3Age(int tire3Age) {
            this.tire3Age = tire3Age;
        }

        public void setTire4Pressure(double tire4Pressure) {
            this.tire4Pressure = tire4Pressure;
        }

        public void setTire4Age(int tire4Age) {
            this.tire4Age = tire4Age;
        }


        public Tires(double tire1Pressure, int tire1Age, double tire2Pressure, int tire2Age, double tire3Pressure, int tire3Age, double tire4Pressure, int tire4Age) {
            this.tire1Pressure = tire1Pressure;
            this.tire1Age = tire1Age;
            this.tire2Pressure = tire2Pressure;
            this.tire2Age = tire2Age;
            this.tire3Pressure = tire3Pressure;
            this.tire3Age = tire3Age;
            this.tire4Pressure = tire4Pressure;
            this.tire4Age = tire4Age;
        }

        public double getTire1Pressure() {
            return tire1Pressure;
        }

        public int getTire1Age() {
            return tire1Age;
        }

        public double getTire2Pressure() {
            return tire2Pressure;
        }

        public int getTire2Age() {
            return tire2Age;
        }

        public double getTire3Pressure() {
            return tire3Pressure;
        }

        public int getTire3Age() {
            return tire3Age;
        }

        public double getTire4Pressure() {
            return tire4Pressure;
        }

        public int getTire4Age() {
            return tire4Age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
//            String[] input = scanner.nextLine().split("\\s+");

//
//            Car car = new Car();
//
//            car.setModel(input[0]);
//
//            car.setCargos(Integer.parseInt(input[1]),Integer.parseInt(input[2]));

//            car.
//
//                    employee.setPosition(input[2]);
//            employee.setDepartment(input[3]);
//
//
//            cars.add(employee);
//        }
//    }
//}
//
//
//

        }
    }
}