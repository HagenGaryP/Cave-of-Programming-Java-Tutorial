/*
The idea behind Encapsulation, is that you "encapsulate" the inner workings of that class within the class.
In other words, you stop people from getting to the core of that class, while they're outside it.

The idea is that you want to make everything you can, private.
If it needs to be accessible in a child class then make it protected.
And finally, the stuff you actually want your end users to be able to use, make public; but try not
    to make any data public except for constants.

This reduces cross languages in your project, because you don't want one class getting into another
    class's stuff and using it.  This avoids creating a potential rat's nest with tightly coupled classes.

The advantages of encapsulation are that you can hide away the implementation details within your class
    and just provide a public API programming interface.
 */

class Plant {

    public static final int ID = 7; // final - constant, can't be changed.
    private String name;

    // if you want to let people get to something from outside the class, we use getters and setters.

    public String getData() {
        String data = "some stuff" + calculateGrowthForecast();

        return data;
    }

    private int calculateGrowthForecast() {
        return 9;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class App {

    public static void main(String[] args) {

    }
}
