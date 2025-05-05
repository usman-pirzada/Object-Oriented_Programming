package CLassPractice;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {

        File file = new File("Output File.txt");

        if(file.delete()) {
            System.out.println("File deleted successfully!");
        } else {
            System.out.println("Unable to delete file or file not found!!");
        }
    }
}