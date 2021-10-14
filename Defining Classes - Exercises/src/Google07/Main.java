package Google07;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, PeopleInfo> peopleInfoMap = new LinkedHashMap<>();
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] in = input.split("\\s+");
            peopleInfoMap.putIfAbsent(in[0], new PeopleInfo(in[0]));
            switch (in[1]) {
                case "company":
                    peopleInfoMap.get(in[0]).addCompany(in[2], in[3], Double.parseDouble(in[4]));
                    break;
                case "pokemon":
                    peopleInfoMap.get(in[0]).addPokemon(in[2], in[3]);
                    break;
                case "parents":
                    peopleInfoMap.get(in[0]).addParents(in[2], in[3]);
                    break;
                case "children":
                    peopleInfoMap.get(in[0]).addChildren(in[2], in[3]);
                    break;
                case "car":
                    peopleInfoMap.get(in[0]).addCar(in[2], Integer.parseInt(in[3]));
                    break;
            }
            input = scan.nextLine();
        }
        String nameOut = scan.nextLine();
        peopleInfoMap.get(nameOut).printInfo();
    }
}
