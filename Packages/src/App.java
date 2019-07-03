/*
Packages perform two functions:

    1. They enable you to organize your code in a sensible fashion.  Which enables you to find
            the files you need quickly.

    2. They stop you from having conflicts between class names.  Can't have two classes of the
            same name, in the same package.

To specify a package - create a new package.  Names should be all lowercase alpha letters, no spaces

a package within a package, call upon the subpackage with .name    For example package ocean.plants;
 */

// in order to use things in the ocean package, you have to import it

import ocean.Fish;
import ocean.plants.Seaweed;

//import ocean.*; // imports all class files from package.

public class App {

    public static void main(String[] args) {

        Fish fish = new Fish();
        Seaweed weed = new Seaweed();

    }
}
