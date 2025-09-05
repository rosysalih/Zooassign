package animals;

import interfaces.Walkable;

/**
 * Represents a Bird, which is an Animal and implements Walkable.
 * Birds can make sounds, move by flying, and walk by hopping.
 */
public class Bird extends Animal implements Walkable {

    /**
     * Constructs a Bird with the given name.
     *
     * @param name The name of the bird. Must not be null or empty.
     * @throws IllegalArgumentException if the name is null or empty.
     */
    public Bird(String name) {
        super(validateName(name));
    }

    /**
     * Validates the name of the bird.
     *
     * @param name The name to validate.
     * @return The validated name.
     * @throws IllegalArgumentException if the name is null or empty.
     */
    private static String validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Bird name cannot be null or empty.");
        }
        return name;
    }

    /**
     * Returns the sound made by the bird.
     *
     * @return A string representing the bird's sound.
     */
    @Override
    public String makeSound() {
        return "Chirp";
    }

    /**
     * Returns the movement of the bird.
     *
     * @return A string describing how the bird moves.
     */
    @Override
    public String move() {
        return "Flies in the sky";
    }

    /**
     * Returns how the bird walks.
     *
     * @return A string describing how the bird walks.
     */
    @Override
    public String walk() {
        return "Hops on the ground";
    }
}