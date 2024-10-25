/**
 * Herbivore class representing plant-eating animals in the Noahark simulation.
 */
public class Herbivore extends Character {

    public Herbivore(String name, int health, int foodRequirement) {
        super(name, health, foodRequirement);
    }

    @Override
    public void performAction() {
        // Herbivores try to find plants (food) to eat.
        System.out.println(name + " is foraging for plants.");
        // Add logic for resource interaction
    }
}
