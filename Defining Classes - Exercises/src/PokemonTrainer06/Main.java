package PokemonTrainer06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!input.equals("Tournament")) {
            String[] in = input.split("\\s+");
            Trainer trainer = new Trainer(in[0]);
            trainers.putIfAbsent(in[0], trainer);
            trainers.get(in[0]).addPokemon(new Pokemon(in[1], in[2], Integer.parseInt(in[3])));
            input = scan.nextLine();
        }

        input = scan.nextLine();
        while (!input.equals("End")) {
            for (Trainer trainer : trainers.values()) {
                if (trainer.containsPokemonsWithGivenElement(input)) {
                    trainer.increaseBadges();
                } else {
                    trainer.decreasePokemonHealth();
                }
            }
            input = scan.nextLine();
        }

        trainers.entrySet().stream()
                .sorted((t1, t2) -> Integer.compare(t2.getValue().getNumberOfBadges(), t1.getValue().getNumberOfBadges()))
                .forEach(e -> System.out.println(e.getValue().toString()));
    }
}
