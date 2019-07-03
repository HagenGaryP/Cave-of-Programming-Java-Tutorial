// car is a child class of Machine, and inherits from it.

public class Car extends Machine {

    public void start() {
        System.out.println("Car started."); // overrides the method in Machine.  Should only override methods, not vars
    }

    public void wipeWindShield() {
        System.out.println("Wiping windshield"); // now has another method that Machine does not have.
    }

    public void showInfo() {
        System.out.println("Car name: " + name);
    }


}
