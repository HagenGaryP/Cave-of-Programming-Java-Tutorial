

public class App {

    public static void main(String[] args) {

        Machine mach1 = new Machine();

        mach1.start();

        Person person1 = new Person("Bob");
        person1.greet();

        // using interface

        Info info1 = new Machine();  // can do this bc Machine() implements the Info interface.
        info1.showInfo();

        // can point to person1, since it's a reference to a person object, of type Info, bc Person implements Info.
        Info info2 = person1;
        info2.showInfo();

        System.out.println();

        // can pass any object to this method that implements the Info interface.
        outputInfo(mach1);
        outputInfo(person1);

    }

    private static void outputInfo(Info info) {
        info.showInfo(); // the only method in the interface.  Can access any method defined in Info

    }
}
