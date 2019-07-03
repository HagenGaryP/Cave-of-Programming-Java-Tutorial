import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
/*
    // first method of handling FileNotFoundException - throws

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("text.txt"); // file doesn't exist, so will give an exception.

        // fileReader is something you use as an intermediate step to reading file.
        FileReader fr = new FileReader(file);  // FileNotFoundException if not "thrown"
    }
 */

    // second method - try / catch

    public static void main(String[] args) {

        File file = new File("text.txt"); // file doesn't exist, so will give an exception.

        try {
            FileReader fr = new FileReader(file);
            // this will not be executed if an exception is thrown.
            System.out.println("Continuing..."); // will print if text.txt file is found in directory
        } catch(FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
            //e.printStackTrace(); // this prints the stack trace exception
        }

    }
}
