package Q_06;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Creating a manager at Systems Limited.....");
        Manager m = new Manager(sc);

        sc.close();
    }
}