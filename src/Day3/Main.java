package Day3;

import Day3.animal.Animal;
import Day3.animal.Dog;
import Day3.animal.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cat());

        for (Animal animal : animals) {
            System.out.println(animal.makeNoise());
        }

    }
}
