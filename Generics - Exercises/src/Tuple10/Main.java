package Tuple10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        Tuple<String,String> nameAndAddress =
                new Tuple<>(line.substring(0, line.lastIndexOf(" ")), line.substring(line.lastIndexOf(" ") + 1));

        System.out.println(nameAndAddress.toString());

        String[] data = scan.nextLine().split("\\s+");

        Tuple<String,Integer> nameAndLitersBeer = new Tuple<>(data[0], Integer.parseInt(data[1]));

        System.out.println(nameAndLitersBeer);

        data = scan.nextLine().split("\\s+");

        Tuple<Integer,Double> tuple = new Tuple<>(Integer.parseInt(data[0]), Double.parseDouble(data[1]));

        System.out.println(tuple.toString());
    }
}
