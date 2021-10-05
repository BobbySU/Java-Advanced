import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterByAge05 {

    public static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Supplier<Person> personSupplier = () -> {
            String[] in = scan.nextLine().split(", ");
            return new Person(in[0], Integer.parseInt(in[1]));
        };

        List<Person> people = IntStream.range(0, n).mapToObj(ignored -> personSupplier.get())
                .collect(Collectors.toList());

        String command = scan.nextLine();
        int ageCommand = Integer.parseInt(scan.nextLine());
        String[] format = scan.nextLine().split("\\s+");

        Predicate<Person> filter = getFilter(command, ageCommand);
        Consumer<Person> print = getPrint(format);

        people.stream().filter(filter).forEach(print);
    }

    public static Predicate<Person> getFilter(String command, int ageCommand) {
        return command.equals("older")
                ? c -> c.age >= ageCommand
                : c -> c.age <= ageCommand;
    }

    public static Consumer<Person> getPrint(String[] format) {
        if (format.length == 2) {
            return p -> System.out.println(p.name + " - " + p.age);
        } else if (format[0].equals("name")) {
            return p -> System.out.println(p.name);
        } else {
            return p -> System.out.println(p.age);
        }
    }
}