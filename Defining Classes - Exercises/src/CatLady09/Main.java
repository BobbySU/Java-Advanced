package CatLady09;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Cat> cats = new ArrayList<>();

        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] in = input.split("\\s+");
            Cat cat = null;
            switch (in[0]) {
                case "StreetExtraordinaire":
                    cat = new StreetExtraordinaire(in[1], Double.parseDouble(in[2]));
                    break;
                case "Siamese":
                    cat = new Siamese(in[1], Double.parseDouble(in[2]));
                    break;
                case "Cymric":
                    cat = new Cymric(in[1], Double.parseDouble(in[2]));
                    break;
            }
            cats.add(cat);
            input = scan.nextLine();
        }

        String nameOut = scan.nextLine();
        cats.stream().filter(cat -> cat.getName().equals(nameOut)).forEach(System.out::println);
    }
}
