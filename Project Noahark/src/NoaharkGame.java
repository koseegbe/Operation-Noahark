import java.util.Scanner;

public class NoaharkGame {
    public NoaharkGame() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Title screen ASCII art
        System.out.println("===================================");
        System.out.println("            NOAHARK                ");
        System.out.println("===================================");
        System.out.println(" ~  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~   ");
        System.out.println("             .--.                  ");
        System.out.println("           .'_\\/_'.                ");
        System.out.println("           '. /\\ .'                ");
        System.out.println("             \"||\"                 ");
        System.out.println("               ||                  ");
        System.out.println("               ||                  ");
        System.out.println("  Guide your species through       ");
        System.out.println("  disasters and rival threats!     ");
        System.out.println("===================================");

        // Player introduction and start prompt
        System.out.println("Welcome to Noahark! Please enter your name:");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "! Type 'start' to begin the game.");

        while (!scanner.nextLine().equalsIgnoreCase("start")) {
            System.out.println("Please type 'start' to begin.");
        }

        // Initialize game
        GameController game = new GameController();
        game.addCharacter(new Herbivore("Deer", 100, 5));
        game.addCharacter(new Herbivore("Rabbit", 60, 3));
        game.addCharacter(new Carnivore("Wolf", 120, 8));
        game.addCharacter(new Carnivore("Fox", 80, 4));

        // Main game loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Turn " + (i + 1));
            game.simulateTurn();
            game.gainProtectionPoints();
            game.showGameState();
            System.out.println("--------------------------------");
        }

        System.out.println("Thank you for playing, " + playerName + "!");
    }
}
