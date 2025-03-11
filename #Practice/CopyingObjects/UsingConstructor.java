package CopyingObjects;

public class UsingConstructor {
    int id;
    String name;

    UsingConstructor(UsingConstructor objToCopy) {  // Deep Copy
        this.id = objToCopy.id;
        this.name = objToCopy.name;
    }

    UsingConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        UsingConstructor obj1 = new UsingConstructor(2025, "Muhammad Usman");
        UsingConstructor obj2 = new UsingConstructor(obj1);

        obj1.display();
        obj2.display();

        System.out.println();
        
        obj1 = obj2;    // Shallow Copy
        obj2.id = 2024;
        obj1.display();
    }
}
