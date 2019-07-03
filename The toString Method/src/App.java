class Frog {

    private int id;
    private String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);

        //return String.format("%4d: %s", id, name); // doing same thing with String.format()

        return sb.toString();
    }
}

public class App {

    public static void main(String[] args) {

        Frog frog1 = new Frog(7, "Freddy");
        Frog frog2 = new Frog(4, "Roger");

        System.out.println(frog1); // doing println on an object tries to invoke toString() method if defined.
        System.out.println(frog2);
    }
}
