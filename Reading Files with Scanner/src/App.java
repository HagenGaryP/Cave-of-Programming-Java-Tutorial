/*
How to read a file using Scanner

First create the txt file, copy the path to reference it.

Can just drag the file to your java project folder and copy the file there
    so it's in your root directory of the program.
If the file is in your project folder you won't have to reference it by path, but just by name.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {   // throwing exception if it can't find file.
        //String fileName = "C:/Users/Gman7/Desktop/Example.txt"; // be careful of the escape \ characters
        String fileName = "Example.txt";

        // Create the file object
        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile); // don't forget to close scanner after opening it.
/*
        // to print out each line of the text file

        while(in.hasNextLine()) {
            String line = in.nextLine();

            System.out.println(line);
        }

 */

        /* if your text file had a number indicating the amount of lines to be read afterwards
            For example:
                        3
                        line one
                        line two
                        line three
        */

        //Can use the int value from scanner's next integer to just read the value
        int value = in.nextInt(); // .nextInt() doesn't read the "invisible" new line character, but ".nextLine() does
        System.out.println("Read value: " + value);

        in.nextLine();  // discards the blank line

        int count = 1;
        while(in.hasNextLine()) {
            String line = in.nextLine(); // reads the new line character after int "3" and will print a blank space.

            System.out.println(count + ": " + line);
            count++;
        }


        in.close();

    }
}
