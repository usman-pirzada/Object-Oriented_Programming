package CLassPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {

        try {
            File file = new File("Output File.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
