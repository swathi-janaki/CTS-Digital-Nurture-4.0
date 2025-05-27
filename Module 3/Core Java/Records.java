import java.util.List;
import java.util.stream.Collectors;

public class RecordExample {

    // Define the record
    public record Person(String name, int age) {}

    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 22),
            new Person("Bob", 17),
            new Person("Charlie", 30),
            new Person("Diana", 15)
        );

        // Print all persons
        System.out.println("All persons:");
        people.forEach(System.out::println);

        // Filter persons age >= 18
        List<Person> adults = people.stream()
                                   .filter(p -> p.age() >= 18)
                                   .collect(Collectors.toList());

        System.out.println("\nAdults (age >= 18):");
        adults.forEach(System.out::println);
    }
}
