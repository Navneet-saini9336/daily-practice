import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReverseStringToFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to reverse:");
        String input = scanner.nextLine();
        scanner.close();

        // Reverse the string
        String reversedString = reverseString(input);

        // Save the reversed string to a file named index.java
        try (FileWriter writer = new FileWriter("index.java")) {
            writer.write("// Reversed string written to index.java\n");
            writer.write("public class Index {\n");
            writer.write("    public static void main(String[] args) {\n");
            writer.write("        System.out.println(\"Reversed String: " + reversedString + "\");\n");
            writer.write("    }\n");
            writer.write("}\n");
            System.out.println("Reversed string saved to index.java");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to reverse a string
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
