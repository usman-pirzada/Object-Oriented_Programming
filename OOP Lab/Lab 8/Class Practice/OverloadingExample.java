package Class_Practice;

class MathOperations {
    int product(int a, int b) {
        return a * b;
    }

    int product(int a, int b, int c) {
        return a * b * c;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int sub(int a, int b, int c) {
        return a - b - c;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        System.out.println(obj.product(2, 3));
        System.out.println(obj.product(2, 3, 0));

        System.out.println(obj.sub(2, 3));
        System.out.println(obj.sub(2, 3, 5));
    }
}