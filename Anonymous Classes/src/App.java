/*
Anonymous Classes
*/

class Machine {
    public void start() {
        System.out.println("Starting machine...");
    }
}

interface Plant {
    public void grow();
}

public class App {

    public static void main(String[] args) {

        Machine machine1 = new Machine() {      // child class of Machine - an anonymous class
            @Override public void start() {                 // start() method in Machine is now overridden
                System.out.println("Camera snapping...");
            }
        };

        machine1.start();

        //Plant plant1 = new Plant(); // Error: "Plant is abstract; cannot be instantiated"
                // cannot instantiate interfaces because there is no code there to actually put into an object

        // the proper way
        Plant plant1 = new Plant() {
            public void grow() {
                System.out.println("Plant growing...");
            }
        };

        plant1.grow(); // call upon the grow method in the Plant interface.  "Plant growing..."
    }
}
