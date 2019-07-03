

public class App {

    public static void main(String[] args) {

        Plant plant1 = new Plant();
        Tree tree = new Tree();

        //Plant plant2 = plant1; // two references to the same object (plant)

        Plant plant2 = tree; // It's the variable that decides what methods you can call.
        // plant 2 points at tree, which uses its grow method from tree

        plant2.grow(); // tree growing.

        tree.shedLeaves();

        //plant2.shedLeaves(); // plant doesn't have shedLeaves() even though it points to Tree

        doGrow(tree); // since tree is a subclass, it can be used in the plant.grow() call

    }

    public static void doGrow(Plant plant) {
        plant.grow(); // calling the plant class's grow() method, which is overridden in Tree class.
    }
}
