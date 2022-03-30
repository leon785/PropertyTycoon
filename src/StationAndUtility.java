/**
 * A class representing stations and utilities on the board.
 *
 * @author Ali Ahmed
 */
public class StationAndUtility extends BoardSpace {

    private final int cost;
    private final Color color;

    /**
     * Constructs a new station and utility object.
     *
     * @param name The station or utility's name.
     * @param cost The cost of buying the station or utility.
     */
    public StationAndUtility(String name, int cost, Color color) {
        super(name);
        this.cost = cost;
        this.color = color;
    }

    /**
     * Returns the cost of buying the station or utility.
     *
     * @return Cost of buying the station or utility.
     */
    public int getCost() {
        return cost;
    }

    /**
     * Returns the color of the sta/uti.
     *
     * @return Color of the sta/uti.
     */
    public Color getColor() {
        return color;
    }
}
