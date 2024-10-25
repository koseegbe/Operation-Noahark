/**
 * Environment class representing different conditions and disasters affecting characters.
 */
public class Environment {
    private int temperature;
    private int disasterRisk;

    public Environment(int temperature, int disasterRisk) {
        this.temperature = temperature;
        this.disasterRisk = disasterRisk;
    }

    /**
     * Method to simulate disasters based on disasterRisk.
     */
    public void simulateDisaster() {
        if (Math.random() * 100 < disasterRisk) {
            System.out.println("A disaster has occurred!");
            // Reduce health or resources of all characters
        }
    }
}
