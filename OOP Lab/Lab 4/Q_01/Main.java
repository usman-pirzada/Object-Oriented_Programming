package Q_01;

public class Main {
    public static void main(String[] args) {

        Bank b1 = new Bank();
        System.out.println(b1);

        Bank b2 = new Bank("Usman", 1323246, 250.32);
        System.out.println(b2);

        b1.finalize();
        b1 = null;
        b2.finalize();
        b2 = null;

        /*
        System.gc() was not executing the overridden finalize method, so finalize method is explicitly called.
        But after doing so, the System.gc() also started executing overridden finalize method.
        */

        System.gc();
    }
}