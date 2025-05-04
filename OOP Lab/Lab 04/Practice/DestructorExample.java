package Practice;

public class DestructorExample {
    @Override
    protected void finalize() {
        System.out.println("\nObject has been destroyed by the Garbage Collector");
    }

    public static void main(String[] args) {
        DestructorExample de = new DestructorExample();

        de = null;

        System.gc();
        System.out.println("Inside the main() method");
    }
}
