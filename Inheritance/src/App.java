// creating another class in a separate file. right-click src or project folder and go to new > class

public class App {

    public static void main(String[] args) {
        Machine mach1 = new Machine();

        mach1.start();
        mach1.stop();

        Car car1 = new Car();

        car1.start();
        car1.wipeWindShield();
        car1.showInfo();

        car1.stop(); // can call these methods from car, which inherits them from Machine

    }
}
