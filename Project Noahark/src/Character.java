/**
 * Abstract class representing a character in the Noahark simulation game.
 * Characters have a name, health, and resource requirements (like food).
 * Each character has different behaviors based on their type.
 */
public abstract class Character {
    protected String name;
    protected int health;
    protected int foodRequirement;

    public Character(String name, int health, int foodRequirement) {
        this.name = name;
        this.health = health;
        this.foodRequirement = foodRequirement;
    }

    /**
     * Abstract method to define character-specific actions.
     */
    public abstract void performAction();

    /**
     * Method to reduce character's health if resources aren't met.
     */
    public void decreaseHealth() {
        health -= 10;  // Deduct health if resources are insufficient
        if (health < 0) health = 0;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
}
