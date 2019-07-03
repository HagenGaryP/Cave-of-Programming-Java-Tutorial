
class Thing {
    // Instance variables are non-static
    public String name; // non-static variable

    // Class variables or "Static Member Variables", belong to the class it's in and only one copy of it.
    public static String description; // static variable

    // Instance Method
    public void showName() {
        System.out.println("object ID: " + id + ", " + description + ": " + name);
        // instance methods can access static data (description)
    }

    // Static Method
    public static void showInfo() {
        System.out.println("Static method running");
        //System.out.println(name); // static methods can't access instance variables.
    }

    // accessing the constant variable we created, called "LUCKY_NUMBER" using final static
    public final static int LUCKY_NUMBER = 7; // "final" is how to create the constant

    // Creating a unique ID number - usually should be protected with 'private'
    public int id; // initialized to zero default

    // another use of static - when counting the number of objects you're creating.
    // normally private
    public static int count = 0;
    public Thing() {

        id = count;

        // increment count
        count++; // count is static - belongs to the class and not the object
                    // meaning there is only one count which is shared between all objects.
    }


}

public class App {

    public static void main(String[] args) {

        Thing.description = "I am a thing";

        //System.out.println(Thing.description); // can be same as calling the static method
        // Static Method call
        Thing.showInfo();

        System.out.println("Before creating objects, count is: " + Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Bob";
        thing2.name = "Sue";

        System.out.println("Before creating objects, count is: " + Thing.count);

        //System.out.println(thing1.name);
        //System.out.println(thing2.name); // these can be replaced by showName() calls

        // calling showName()
        thing1.showName();
        thing2.showName();

        // Math.CLASS is static bc it deals with constants, which are represented by UPPERCASE
        System.out.println(Math.PI); // Math.PI is a constant - unchangeable

        System.out.println(Thing.LUCKY_NUMBER);


    }
}
