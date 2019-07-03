import java.util.ArrayList;
import java.util.HashMap;

class Animal {

}

public class Apps {

    public static void main(String[] args) {
        /*
        ///////////////// before java 5 //////////////////
        ArrayList list = new ArrayList();

        list.add("apple"); // index 0
        list.add("orange"); // index 1

        String fruit = (String)list.get(1); // had to downcast to a string
        System.out.println(fruit);
        */

        // After generics were introduced - if you have a class that works with some particular type of
        //  object, or even 2 or more types of distinct objects, then you can specify using generics.

        ArrayList<String> strings = new ArrayList<String>();  // need to import java.util.ArrayList;

        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1);

        System.out.println(animal);


        //////////// there can be more than one type of argument /////////////////////

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        //////////// Java 7 style //////////

        ArrayList<Animal> someList = new ArrayList<>();// can take in any object/class - like the Animal class created.


    }
}
