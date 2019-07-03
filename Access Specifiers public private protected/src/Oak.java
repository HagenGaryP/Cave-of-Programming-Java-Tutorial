
public class Oak extends Plant {

    public Oak() {
        // type = "tree"; // won't work bc we cant access private "type" here.

        this.size = "large"; // works because "size" is protected, and Oak is a subclass of Plant.
    }
}
