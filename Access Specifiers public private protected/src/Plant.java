

public class Plant {

    // Bad practice to declare public instance variables.
    public String name;

    public final static int ID = 8; // acceptable, since we made it constant - can't change constants

    // PRIVATE - only accessible from within the plant class.

    private String type;

    // PROTECTED - accessible in child classes

    protected String size;

    public Plant() {
        this.name = "Fred";
        this.type = "plant";

        this.size = "medium";
    }

}
