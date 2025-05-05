package CLassPractice;

import java.io.FileWriter;
import java.io.IOException;

import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Output File.txt", true);
            writer.write("Cloud computing\n");
            writer.write("Bye");
            writer.close();
            System.out.println("File appended!");
        } catch(IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}