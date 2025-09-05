import java.util.ArrayList;

/**
 * Abstract class representing an animal.
 */
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String makeSound();

    public abstract String move();
}

/**
 * Interface for animals that can swim.
 */
interface Swimmable {
    String swim();
}

/**
 * Interface for animals that can walk.
 */
interface Walkable {
    String walk();
}

/**
 * Represents a Bird, which is an Animal and implements Walkable.
 */
class Bird extends Animal implements Walkable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Chirp";
    }

    @Override
    public String move() {
        return "Flies in the sky";
    }

    @Override
    public String walk() {
        return "Hops on the ground";
    }
}

/**
 * Represents a Fish, which is an Animal and implements Swimmable.
 */
class Fish extends Animal implements Swimmable {
    public Fish(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Blub";
    }

    @Override
    public String move() {
        return swim();
    }

    @Override
    public String swim() {
        return "Fish swims using its fins";
    }
}

/**
 * Represents a Dog, which is an Animal and implements Walkable.
 */
class Dog extends Animal implements Walkable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Bark";
    }

    @Override
    public String move() {
        return "Runs on the ground";
    }

    @Override
    public String walk() {
        return "Dog walks on four legs";
    }
}

/**
 * Main class to demonstrate the functionality of the zoo.
 */
public class Main {
    public static void main(String[] args) {
        // Create a collection of animals
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(new Bird("Sparrow"));
        zoo.add(new Fish("Goldfish"));
        zoo.add(new Dog("Buddy"));

        // Display information about each animal
        for (Animal animal : zoo) {
            System.out.println("Name: " + animal.getName());
            System.out.println("Sound: " + animal.makeSound());
            System.out.println("Movement: " + animal.move());

            // Check for additional behaviors
            if (animal instanceof Swimmable) {
                System.out.println("Swimming: " + ((Swimmable) animal).swim());
            }
            if (animal instanceof Walkable) {
                System.out.println("Walking: " + ((Walkable) animal).walk());
            }
            System.out.println();
        }
    }
}