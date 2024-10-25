/**
 * Carnivore class representing meat-eating animals in the Noahark simulation.
 */
public class Carnivore extends Character {

    public Carnivore(String name, int health, int foodRequirement) {
        super(name, health, foodRequirement);
    }

    @Override
    public void performAction() {
        // Carnivores hunt herbivores
        System.out.println(name + " is hunting for prey.");
        // Add logic to find and reduce herbivore population
    }
}
