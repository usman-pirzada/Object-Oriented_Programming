package PastPaper24;

import java.io.*;

public class Q3B {
    public static void main(String[] args) {
        
        Test t1 = new Test(321, "Hamza");
        Test t2 = new Test(775, "Talal");

        t1.Add("Output1.txt");
        t2.Add("Output2.txt");

        System.out.println();
        
        Test.Get("Output1.txt");
        Test.Get("Output2.txt");
    }
}

class Test implements Serializable {
    int ID;
    String name;
    static int grnID;

    Test (int ID, String name) {
        this.ID = ID;
        this.name = name;
        grnID = ID + 1;
    }

    void Add(String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(this);
            System.out.println("Data saved successfully to \"" + filename + "\".");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void Get(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Test t = (Test) in.readObject();
            System.out.println("ID: " + t.ID + ", Name: " + t.name);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
