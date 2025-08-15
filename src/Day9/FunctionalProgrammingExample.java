import java.util.*;
import java.util.stream.*;

class Person {
    String name;
    int age;
    String city;

    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}

public class FunctionalProgrammingExample {
    public static void main(String[] args) {

        // 1. Filter, map and reduce a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumOfSquaresOfEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println("Sum of squares of even numbers: " + sumOfSquaresOfEvenNumbers);

        // 2. Create a list of objects and filter by attributes
        List<Person> people = Arrays.asList(
                new Person("Alice", 25, "New York"),
                new Person("Bob", 30, "Los Angeles"),
                new Person("Charlie", 28, "New York"),
                new Person("Diana", 35, "Chicago")
        );

        List<Person> peopleInNewYork = people.stream()
                .filter(p -> p.getCity().equals("New York"))
                .collect(Collectors.toList());

        System.out.println("People living in New York:");
        peopleInNewYork.forEach(p -> System.out.println(p.getName()));

        // 3. Chain multiple functional operations to solve a real problem
        double averageAgeInNY = people.stream()
                .filter(p -> p.getCity().equals("New York"))
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);

        System.out.println("Average age in New York: " + averageAgeInNY);
    }
}