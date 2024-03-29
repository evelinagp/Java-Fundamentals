package FundamentalsMidExams.MidExam06;

import java.util.Arrays;
import java.util.Scanner;
public class ManOWarMidExam06Ex3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] pirateShip = Arrays.stream(scanner.nextLine().split(">")).mapToInt(Integer::parseInt).toArray();
            int[] warShip = Arrays.stream(scanner.nextLine().split(">")).mapToInt(Integer::parseInt).toArray();
            int maxHealth = Integer.parseInt(scanner.nextLine());
            boolean stalemate = true;

            String input = scanner.nextLine();

            while (!input.equals("Retire")) {
                String[] command = input.split(" ");
                switch (command[0]) {
                    case "Fire":
                        int fireIndex = Integer.parseInt(command[1]);
                        int fireDamage = Integer.parseInt(command[2]);
                        if (fireIndex >= 0 && fireIndex < warShip.length){
                            warShip[fireIndex] -= fireDamage;
                            if (warShip[fireIndex] <= 0)    {
                                System.out.println("You won! The enemy ship has sunken.");
                                stalemate = false;
                                break;
                            }
                        }
                        break;

                    case "Defend":
                        int startIndex = Integer.parseInt(command[1]);
                        int endIndex = Integer.parseInt(command[2]);
                        int damage = Integer.parseInt(command[3]);
                        if (startIndex >= 0 && startIndex < pirateShip.length && endIndex > 0 && endIndex < pirateShip.length && startIndex <= endIndex){
                            for (int i = startIndex; i <= endIndex; i++) {
                                pirateShip[i] -= damage;
                                if (pirateShip[i] <= 0) {
                                    System.out.println("You lost! The pirate ship has sunken.");
                                    stalemate = false;
                                    break;
                                }
                            }
                        }
                        break;

                    case "Repair":
                        int repairIndex = Integer.parseInt(command[1]);
                        int health = Integer.parseInt(command[2]);
                        if (repairIndex >= 0 && repairIndex < pirateShip.length)    {
                            pirateShip[repairIndex] += health;
                            if (pirateShip[repairIndex] > maxHealth)    {
                                pirateShip[repairIndex] = maxHealth;
                            }
                        }
                        break;

                    case "Status":
                        int sectionsToRepair = 0;
                        for (int ship : pirateShip) {
                            if (ship < (maxHealth * 0.2)) {
                                sectionsToRepair++;
                            }
                        }
                        System.out.printf("%d sections need repair.%n", sectionsToRepair);
                        break;
                }
                input = scanner.nextLine();
            }

            if (stalemate)  {
                int pirateShipStatus = 0;
                for (int shipHealth : pirateShip) {
                    pirateShipStatus += shipHealth;
                }
                int warShipStatus = 0;
                for (int shipHealth : warShip) {
                    warShipStatus += shipHealth;
                }
                System.out.printf("Pirate ship status: %d%n" +
                        "Warship status: %d", pirateShipStatus, warShipStatus);
            }
        }
    }

