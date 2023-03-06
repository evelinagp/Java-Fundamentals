package FundamentalsFinalExams.FinalExam3;

import java.util.*;

public class NeedForSpeedExam3Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> mileageAndCar = new LinkedHashMap<>();
        Map<String, Integer> fuelAndCar = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\|");
            String car = tokens[0];
            int mileage = Integer.parseInt(tokens[1]);
            int fuel = Integer.parseInt(tokens[2]);
            mileageAndCar.put(car, mileage);
            fuelAndCar.put(car, fuel);

        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] tokens = command.split(" : ");

            String commandName = tokens[0];
            String car = tokens[1];
            switch (commandName) {
                case "Drive":
//•	Drive : {car} : {distance} : {fuel}
//o	You need to drive the given distance and you will need the given fuel to do that. If the car doesn`t have enough fuel print:
//"Not enough fuel to make that ride"
//o	If the car has the required fuel available in the tank, increase its mileage with the given distance, decrease its fuel with the given fuel and print:
//"{car} driven for {distance} kilometers. {fuel} liters of fuel consumed."
//o	You like driving new cars only, so if the mileage of a car reaches 100 000 km, remove it from the collection(s). Print:
//"Time to sell the {car}!"
                    int distance = Integer.parseInt(tokens[2]);
                    int neededFuel = Integer.parseInt(tokens[3]);
                    int currentFuel = fuelAndCar.get(car);
                    if (currentFuel > neededFuel) {
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, neededFuel);
                        mileageAndCar.put(car, mileageAndCar.get(car) + distance);
                        fuelAndCar.put(car, fuelAndCar.get(car) - neededFuel);
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    if (mileageAndCar.get(car) >= 100000) {
                        mileageAndCar.remove(car);
                        fuelAndCar.remove(car);
                        System.out.printf("Time to sell the %s!%n", car);
                    }
                    break;
                case "Refuel":
// Refuel : {car} : {fuel} - refill the tank of your car.
//o	Each tank can hold a maximum of 75 liters of fuel, so if the given amount of fuel is more than you can fit in the tank,
// take only what is required to fill it up.Print a message in the following format:
//"{car} refueled with {fuel} liters"
                    int fuelToRefill = Integer.parseInt(tokens[2]);

                    if ((fuelAndCar.get(car) + fuelToRefill) > 75) {
                        int maxFuelToRefill = 75 - fuelAndCar.get(car);
                        fuelAndCar.put(car, fuelAndCar.get(car) + maxFuelToRefill);
                        System.out.printf("%s refueled with %d liters%n", car, maxFuelToRefill);

                    } else {
                        fuelAndCar.put(car, fuelAndCar.get(car) + fuelToRefill);
                        System.out.printf("%s refueled with %d liters%n", car, fuelToRefill);
                    }
                    break;
                case "Revert":
//Revert : {car} : {kilometers} - Decrease the mileage of the given car with the given kilometers and print the kilometers
// you have decreased it with in the following format: "{car} mileage decreased by {amount reverted} kilometers"
// If the mileage becomes less than 10 000km after it is decreased, just set it to 10 000km and DO NOT print anything.
                    int kilometers = Integer.parseInt(tokens[2]);
                    if ((mileageAndCar.get(car) - kilometers) < 10000) {
                        mileageAndCar.put(car, 10000);
                    } else {
                        mileageAndCar.put(car, mileageAndCar.get(car) - kilometers);
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        mileageAndCar.entrySet().stream().
                  //  sorted((f, s) -> s.getValue() - f.getValue()).
                    forEach(i -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",i.getKey(), i.getValue(),
                            fuelAndCar.get(i.getKey())));
        }
    }



