import java.util.ArrayList;
import java.util.List;

/**
 * GameController class managing the overall game state and character interactions.
 */
public class GameController {
    private List<Character> characters;  // List to store all characters
    private Environment environment;
    private int protectionPoints;

    public GameController() {
        characters = new ArrayList<>();
        environment = new Environment(25, 20);  // Initial conditions
        protectionPoints = 0;
    }

    /**
     * Adds a character to the game.
     * @param character The character to be added to the simulation.
     */
    public void addCharacter(Character character) {
        characters.add(character);
    }

    /**
     * Method to simulate a single game turn, including character actions and environmental events.
     */
    public void simulateTurn() {
        for (Character character : characters) {
            character.performAction();
        }
        environment.simulateDisaster();
    }

    /**
     * Adds protection points over time for the player to use in saving species.
     */
    public void gainProtectionPoints() {
        protectionPoints += 5;
    }

    /**
     * Displays the current state of characters and environment.
     */
    public void showGameState() {
        for (Character character : characters) {
            System.out.println(character.getName() + " has health: " + character.getHealth());
        }
        System.out.println("Protection points available: " + protectionPoints);
    }
}