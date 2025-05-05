package CLassPractice;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {

        try {
            FileWriter file = new FileWriter("Output File.txt");
            file.write("I am writing to a text file.\nRegards.");
            file.close();
            System.out.println("Successfully wrote to the file!");
            file.close();

        } catch(IOException e) {
            System.out.println("An Error Occurred while writing to file!!");
        }
    }
}