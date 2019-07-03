class Machine {
    private String name;
    private int code;

    public Machine() {
        // Calling a constructor inside of another constructor, must be first statement!!
        this("Arnie", 0);   // defaulting name to "Arnie" and code to "0"

        // Calling upon this constructor (without parameters) will first call upon the 3rd constructor
        // then will run the rest of the statements here.

        System.out.println("Constructor running!");

        name = "Gary";  // every time a new instance of Machine() is created, default name = "Gary"

    }
    // adding a constructor that accepts a String parameter

    public Machine(String name) {
        // defaulting the code to zero
        this(name, 0);

        System.out.println("2nd constructor running!");
        this.name = name;       // could work just like a set method
    }

    public Machine(String name, int code) {

        System.out.println("3rd constructor running!");
        this.name = name;
        this.code = code;
    }
}

public class Constructors {

    public static void main(String[] args) {
        Machine machine1 = new Machine();  // new Machine() creates a new instance of Machine class.

        // even if machine1 is never used (greyed out), it wills till run the constructor method.

        //new Machine();  // this alone will run constructor.  "constructor running!" printed twice.

        // passing in a string into the Machine() class, looks for the constructor that accepts the string.
       // Machine machine2 = new Machine("Bertie");

        // passing (string, int) into Machine() - looks for corresponding constructor with (string, int)
       // Machine machine3 = new Machine("Chalky", 7);
    }
}
