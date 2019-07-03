import java.util.ArrayList;

class Machine {

    @Override
    public String toString() {
        return "I am a Machine";
    }
    public void start() {
        System.out.println("Machine starting.");

    }
}

class Camera extends Machine {
    @Override
    public String toString() {
        return "I am a Camera";
    }

    public void snap() {
        System.out.println("snap!");
    }
}

public class App {

    public static void main(String[] args) {

        ArrayList<Machine> list1 = new ArrayList<Machine>();
        // passing list to a method as a parameter

        list1.add(new Machine());
        list1.add(new Machine());

        // camera is a subclass of machine. But an arrayList of cameras is not a subclass of ArrayList of Machine.
        // Can't pass to method.  Bc showList method accepts an ArrayList of machine.

        // An ArrayList of child class type, or any parameterized class, which is passed the type "parameters in
        //      the child class type" is not a subclass of the same parameterized class with the parent type of
        //      class as its type parameter.


        // A way to pass an ArrayList of camera to the ShowList(ArrayList<> list) method - add wildcard "?" in <>

        ArrayList<Camera> list2 = new ArrayList<Camera>();

        list2.add(new Camera());
        list2.add(new Camera());

        showList(list1);
        showArrayList(list2);

    }

    public static void showList(ArrayList<?> list) {    // using wildcard "?" question mark
        for(Object value: list) {       // must treat items in the last as a type OBJECT
            // could downcast ^ Object to a "Camera" object, and then you could call camera specific methods.
            System.out.println(value);
        }

    }

    // to call machine methods
    // Lets java know you're referring to ArrayList for machine and camera, and any childhood of current classes.
    public static void showArrayList(ArrayList<? extends Machine> list) {
        for (Machine value : list) {
            System.out.println(value);

            value.start(); // can call machine methods
        }
    }

    // Whatever you pass the list method, now has to be Camera, or a superclass of Camera.  The trouble with that
    //      is superclasses of Camera do not necessarily have Camera methods in them.
    public static void showList2(ArrayList<? super Camera> list) {
        for (Object value : list) {

            System.out.println(value);
        }
    }
}
