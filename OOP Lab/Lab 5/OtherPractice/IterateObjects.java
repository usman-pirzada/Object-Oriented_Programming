package OtherPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IterateObjects {
    int rollNo;
    String name;
    int age;

    IterateObjects(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IterateObjects o1 = new IterateObjects(101, "Hamza", 23);
        IterateObjects o2 = new IterateObjects(102, "Abuzar", 20);
        IterateObjects o3 = new IterateObjects(103, "Talha", 18);

        ArrayList<IterateObjects> al = new ArrayList<>();
        al.add(o1);
        al.add(o2);
        al.add(o3);

        // Getting Iterator
        Iterator<IterateObjects> itr = al.iterator();

        // Transversing elements of ArrayList object
        while (itr.hasNext()) {
            IterateObjects obj = itr.next();
            System.out.println(obj.rollNo + " " + obj.name + " " + obj.age);
        }
    }
}
