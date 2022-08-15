package ExamPreparation;

import java.util.*;

public class HeroesOfCodeAndLogicVIIExam4Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> heroesHP = new TreeMap<>();
        Map<String, Integer> heroesMP = new TreeMap<>();

        int countHeroes = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countHeroes; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String heroName = tokens[0];
            int hp = Integer.parseInt(tokens[1]);
            int mp = Integer.parseInt(tokens[2]);
//          hp
            if (hp <= 100) {
//                име на героя + hp
                heroesHP.put(heroName, hp);
//mp
            }
            if (mp <= 200) {
                heroesMP.put(heroName, mp);
            }
        }
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split(" - ");
            String commandName = command[0];
            String heroName = command[1];
            switch (commandName) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(command[2]);
                    String spellName = command[3];
                    int mpCurrent = heroesMP.get(heroName);
                    if (mpCurrent >= mpNeeded) {
//                        Мога да направя магията -> текущото МР >= нужното
                        int mpLeft = mpCurrent - mpNeeded;
                        heroesMP.put(heroName, mpLeft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, mpLeft);
                    } else {
                        //не мога!
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(command[2]);
                    String attacker = command[3];
                    int currentHP = heroesHP.get(heroName) - damage;
                    if (currentHP > 0) {
//                        жив
                        heroesHP.put(heroName, currentHP);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHP);
                    } else {
//                        умрял
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroesHP.remove(heroName);
                        heroesMP.remove(heroName);
                    }
                    break;
                case "Recharge":
                    int amountIncrease = Integer.parseInt(command[2]);
                    int currentMp = heroesMP.get(heroName);
                    int increasedMp = currentMp + amountIncrease;//увеличаваме
                    if (increasedMp > 200) {
                        increasedMp = 200;
                    }
                    heroesMP.put(heroName, increasedMp);
                    System.out.printf("%s recharged for %d MP!%n", heroName, increasedMp - currentMp);
                    break;
                case "Heal":
                    int amount = Integer.parseInt(command[2]);
                    int currentHp = heroesHP.get(heroName);
                    int increasedHp = currentHp + amount;//увеличаваме
                    if (increasedHp > 100) {
                        increasedHp = 100;
                    }
                    heroesHP.put(heroName, increasedHp);
                    System.out.printf("%s healed for %d HP!%n", heroName, increasedHp - currentHp);
                    break;

            }
            input = scanner.nextLine();
        }
//        по hp в низходящ ред и после по име във възходящ?!
        heroesHP.entrySet().stream()
                .sorted((h1, h2) -> h2.getValue().compareTo(h1.getValue()))
                .forEach(hero -> {
                    System.out.println(hero.getKey());
                    System.out.println("  HP: " + hero.getValue());
                    System.out.println("  MP: " + heroesMP.get(hero.getKey()));
                });
    }
}
