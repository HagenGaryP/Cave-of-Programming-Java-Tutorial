public class Machine { // parent class

    //private String name = "Machine Type 1"; // can only be accessed in Machine class.

    // protected means you can access this anywhere from within the package, and also from any child class.
    protected String name = "Machine Type 1";

    public void start() {
        System.out.println("Machine started.");
    }

    public void stop() {
        System.out.println("Machine stopped.");

    }
}
