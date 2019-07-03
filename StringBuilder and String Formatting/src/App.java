

public class App {
    public static void main(String[] args) {

        // Can't literally append/modify a String object once it's created, but can reassign the variable
        // and concatenate with +=, but this is inefficient for memory usage.

        // Ex: inefficient String concatenation
        String info = "";

        info += "My name is Gary.";
        info += " ";
        info += "Like the snail in SpongeBob.\n";

        System.out.println(info);

        // Using the more efficient StringBuilder class

        StringBuilder sb = new StringBuilder("");
        // This instantiates the StringBuilder class by dynamically allocating memory for a new object and
        //      returning a reference to that memory.
        // It also initializes the new object by calling the class's constructor method "StringBuilder()"

        sb.append("Once upon a time...");
        sb.append(" ");
        sb.append("There was a guy named Gary.. yep.. Gary..");

        // method chaining & String Formatting with escape sequences
        sb.append("\nThere isn't much to say about him.")
                .append(" ")
                .append("He likes turtles.")
                .append("\tThe end.\n");

        // printing the object with .toString()
        System.out.println(sb.toString());

/*          **********    FORMATTING ************

The following characters are reserved in Java and must be properly escaped to be used within strings:

            Backspace is replaced with \b.
            Newline is replaced with \n.
            Tab is replaced with \t.
            Carriage return is replaced with \r.
            Form feed is replaced with \f.
            Double quote is replaced with \"
            Backslash is replaced with \\
         */

        // If you're creating multi-threaded versions, you'd need to use a StringBuilder that is safe to
        //      access from multiple threads.  StringBuffer is a thread-safe version of StringBuilder.

        // StringBuilder is more lightweight since it isn't thread-safe.

        // methods that take a string format - printf stands for print format

        // use %d to print format with INTEGERS
        System.out.printf("Total cost: %4d \nQuantity: %8d\n", 5, 120);  // printf doesn't carriage return after line.
        // using %-4d will print the first value passed (5) then indent 4 spaces before printing the rest.
        //         ^Can be any number
        // using a positive number, "%4d", would indent that number of spaces THEN print the value passed.

        // right-align
        for(int i = 8; i < 12; i++) {
            System.out.printf("%2d: some text here\n", i);
        }
        System.out.println("");
        // left-align
        for(int i = 8; i < 12; i++) {
            System.out.printf("%-2d: some text here\n", i);
        }

        // %s to format a string argument passed in.
        for(int i = 0; i < 20; i++) {
            System.out.printf("%-2d: %s\n", i, "here is some text");
        }

        // %f means floating point.
        System.out.printf("Total value: %.2f\n", Math.PI); // %.2f rounds the number, pi, to 2 decimal places.


    }
}
