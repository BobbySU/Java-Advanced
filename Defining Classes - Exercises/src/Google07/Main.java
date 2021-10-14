package Google07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String,PeopleInfo> peopleInfoMap = new HashMap<>();
        String input = scan.nextLine();
        while (input.equals("End")){
            String[] in = input.split("\\s+");

            switch (in[1]){
                case "company":

                    break;
                case "pokemon":

                    break;
                case "parents":

                    break;
                case "children":

                    break;
                case "car":

                    break;
            }
            input = scan.nextLine();
        }
        String nameOut = scan.nextLine();


    }
}
